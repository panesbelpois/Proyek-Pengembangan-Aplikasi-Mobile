package com.example.fitgen.data.repository

import com.example.fitgen.data.remote.api.ExerciseApiService
import com.example.fitgen.domain.repository.ExerciseImageRepository

class ExerciseImageRepositoryImpl(
    private val apiService: ExerciseApiService
) : ExerciseImageRepository {
    override suspend fun getExerciseGifUrl(exerciseName: String): String? {
        val cleanName = exerciseName.lowercase().trim()
        
        // Menggunakan hash dari nama sebagai seed agar gambar selalu konsisten untuk gerakan yang sama
        val seed = cleanName.hashCode().let { if (it < 0) -it else it } % 1000
        return "https://loremflickr.com/400/300/fitness,gym/all?lock=$seed"
    }
}
