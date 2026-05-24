package com.example.fitgen.presentation.screens.ai

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitgen.domain.repository.AIRepository
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

// ==================== ENUMS / DATA ====================

enum class EquipmentChip(val label: String, val emoji: String) {
    NO_EQUIPMENT("Tanpa Alat", "🏠"),
    DUMBBELL("Dumbbell", "🏋️"),
    BARBELL("Barbel", "🔩"),
    RESISTANCE_BAND("Resistance Band", "〰️"),
    KETTLEBELL("Kettlebell", "⚾"),
    GYM_FULL("Gym Lengkap", "🏢")
}

enum class DurationChip(val label: String, val minutes: Int) {
    MIN_10("10 Menit", 10),
    MIN_15("15 Menit", 15),
    MIN_20("20 Menit", 20),
    MIN_30("30 Menit", 30),
    MIN_45("45 Menit", 45),
    MIN_60("60 Menit", 60)
}

enum class GoalChip(val label: String, val emoji: String) {
    FAT_BURN("Bakar Lemak", "🔥"),
    MUSCLE_BUILD("Bangun Otot", "💪"),
    CARDIO("Kardio", "❤️"),
    STRENGTH("Kekuatan", "🦾"),
    FLEXIBILITY("Fleksibilitas", "🧘"),
    ENDURANCE("Daya Tahan", "⚡")
}

enum class LevelChip(val label: String) {
    BEGINNER("Pemula"),
    INTERMEDIATE("Menengah"),
    ADVANCED("Mahir")
}

// ==================== UI STATE ====================

data class DynamicWorkoutUiState(
    val customPrompt: String = "",
    val selectedEquipment: Set<EquipmentChip> = setOf(EquipmentChip.NO_EQUIPMENT),
    val selectedDuration: DurationChip = DurationChip.MIN_30,
    val selectedGoal: GoalChip = GoalChip.FAT_BURN,
    val selectedLevel: LevelChip = LevelChip.BEGINNER,
    val isLoading: Boolean = false,
    val result: String? = null,
    val error: String? = null
) {
    val canGenerate: Boolean
        get() = !isLoading
}

sealed interface DynamicWorkoutEvent {
    data class ShowSnackbar(val message: String) : DynamicWorkoutEvent
}

// ==================== VIEW MODEL ====================

class DynamicWorkoutViewModel(
    private val aiRepository: AIRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(DynamicWorkoutUiState())
    val uiState: StateFlow<DynamicWorkoutUiState> = _uiState.asStateFlow()

    private val _events = MutableSharedFlow<DynamicWorkoutEvent>()
    val events: SharedFlow<DynamicWorkoutEvent> = _events.asSharedFlow()

    fun onCustomPromptChange(text: String) {
        _uiState.update { it.copy(customPrompt = text, error = null) }
    }

    fun onEquipmentToggle(chip: EquipmentChip) {
        _uiState.update { state ->
            val current = state.selectedEquipment.toMutableSet()
            if (current.contains(chip)) {
                if (current.size > 1) current.remove(chip)
            } else {
                current.add(chip)
            }
            state.copy(selectedEquipment = current)
        }
    }

    fun onDurationSelect(chip: DurationChip) {
        _uiState.update { it.copy(selectedDuration = chip) }
    }

    fun onGoalSelect(chip: GoalChip) {
        _uiState.update { it.copy(selectedGoal = chip) }
    }

    fun onLevelSelect(chip: LevelChip) {
        _uiState.update { it.copy(selectedLevel = chip) }
    }

    fun generateWorkout() {
        val state = _uiState.value
        _uiState.update { it.copy(isLoading = true, error = null, result = null) }

        val equipmentText = state.selectedEquipment.joinToString(", ") { it.label }
        val prompt = buildString {
            append("Buatkan program latihan workout dengan spesifikasi berikut:\n")
            append("- Tujuan: ${state.selectedGoal.label}\n")
            append("- Durasi: ${state.selectedDuration.minutes} menit\n")
            append("- Peralatan: $equipmentText\n")
            append("- Level: ${state.selectedLevel.label}\n")
            if (state.customPrompt.isNotBlank()) {
                append("- Catatan tambahan: ${state.customPrompt}\n")
            }
            append("\nTampilkan program lengkap dengan nama latihan, set, repetisi, dan waktu istirahat. Gunakan bahasa Indonesia.")
        }

        viewModelScope.launch {
            aiRepository.chat(prompt)
                .onSuccess { output ->
                    _uiState.update { it.copy(isLoading = false, result = output) }
                }
                .onFailure { error ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = error.message ?: "Terjadi kesalahan, coba lagi"
                        )
                    }
                }
        }
    }

    fun clearResult() {
        _uiState.update { it.copy(result = null, error = null) }
    }
}
