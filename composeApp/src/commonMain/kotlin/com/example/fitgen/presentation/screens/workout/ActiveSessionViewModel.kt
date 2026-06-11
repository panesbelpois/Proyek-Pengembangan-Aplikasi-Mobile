package com.example.fitgen.presentation.screens.workout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitgen.domain.model.Exercise
import com.example.fitgen.domain.model.WorkoutLog
import com.example.fitgen.domain.repository.WorkoutRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class ActiveSessionViewModel(
    private val workoutRepository: WorkoutRepository
) : ViewModel() {

    private val DEFAULT_DURATION = 60L
    private val _remainingSeconds = MutableStateFlow(DEFAULT_DURATION)
    val remainingSeconds: StateFlow<Long> = _remainingSeconds.asStateFlow()

    private val _isPlaying = MutableStateFlow(false)
    val isPlaying: StateFlow<Boolean> = _isPlaying.asStateFlow()

    private val _isFinished = MutableStateFlow(false)
    val isFinished: StateFlow<Boolean> = _isFinished.asStateFlow()

    private var timerJob: Job? = null

    fun togglePlayPause() {
        if (_isPlaying.value) {
            pauseTimer()
        } else {
            startTimer()
        }
    }

    private fun startTimer() {
        _isPlaying.value = true
        timerJob = viewModelScope.launch {
            while (_isPlaying.value && _remainingSeconds.value > 0) {
                delay(1000L)
                _remainingSeconds.value -= 1
            }
            if (_remainingSeconds.value <= 0) {
                _isPlaying.value = false
            }
        }
    }

    private fun pauseTimer() {
        _isPlaying.value = false
        timerJob?.cancel()
    }

    fun finishSession(exerciseName: String) {
        pauseTimer()
        viewModelScope.launch {
            val totalSeconds = DEFAULT_DURATION - _remainingSeconds.value
            val minutes = totalSeconds / 60
            val seconds = totalSeconds % 60
            val formattedTime = "${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}"

            val exercise = Exercise(
                nama = exerciseName,
                sets = 1,
                reps = 1,
                beban = 0.0
            )

            val catatan = "Diselesaikan via Active Session - Durasi: $formattedTime"
            workoutRepository.addExerciseToTodayLog(exercise, catatan)
            _isFinished.value = true
        }
    }
}
