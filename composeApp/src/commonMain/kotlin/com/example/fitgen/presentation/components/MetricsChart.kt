package presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeightTrackerChart(weights: List) {
    Text(text = "Grafik Berat Badan", style = MaterialTheme.typography.titleMedium)
    Spacer(modifier = Modifier.height(8.dp))
    Canvas(modifier = Modifier.fillMaxWidth().height(150.dp)) {
        // Gambar diagram garis berat badan
        val maxW = weights.maxOrNull() ?: 1f
        val minW = weights.minOrNull() ?: 0f
        val range = maxW - minW
        val stepX = if (weights.size > 1) size.width / (weights.size - 1) else size.width
        weights.forEachIndexed { i, w ->
            val x = i * stepX
            val y = size.height - ((w - minW) / range) * size.height
            if (i < weights.size - 1) {
                val nx = (i + 1) * stepX
                val ny = size.height - ((weights[i + 1] - minW) / range) * size.height
                drawLine(
                    color = androidx.compose.ui.graphics.Color.Blue,
                    start = androidx.compose.ui.geometry.Offset(x, y),
                    end = androidx.compose.ui.geometry.Offset(nx, ny),
                    strokeWidth = 3f
                )
            }
        }
    }
}

@Composable
fun BmiGauge(bmi: Float) {
    Text(text = "BMI: ${"%.1f".format(bmi)}", style = MaterialTheme.typography.titleMedium)
    val status = when {
        bmi < 18.5f -> "Underweight"
        bmi < 25f   -> "Normal"
        bmi < 30f   -> "Overweight"
        else        -> "Obese"
    }
    Text(text = "Status: $status", style = MaterialTheme.typography.bodyMedium)
}