package com.example.fitgen.domain.usecase

import com.example.fitgen.domain.repository.AIRepository

class AnalyzeFoodNutritionUseCase(private val aiRepository: AIRepository) {

    // Fungsi ini menerima ByteArray gambar (hasil jepretan)
    suspend operator fun invoke(imageBytes: ByteArray): Result<NutritionData> {
        return try {
            val prompt = """
                Analisis gambar makanan ini. Berikan estimasi nutrisi dalam format JSON persis seperti ini:
                { "kalori": 0, "protein": 0, "karbohidrat": 0, "lemak": 0 }
            """.trimIndent()

            // Memanggil repository AI (pastikan AIRepository memiliki fungsi ini)
            val jsonResponse = aiRepository.analyzeImage(prompt, imageBytes)

            // Logika parsing JSON manual (atau gunakan kotlinx.serialization)
            // Ini adalah contoh return data sukses
            Result.success(NutritionData(350, 20, 40, 15))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

// Data class sementara untuk menampung hasil
data class NutritionData(val kalori: Int, val protein: Int, val karbohidrat: Int, val lemak: Int)