package com.example.fitgen.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MetricsChart(modifier: Modifier = Modifier) {
    val maroon = Color(0xFF800000)

    Column(modifier = modifier.fillMaxWidth()) {
        Text("Grafik Berat Badan", color = Color.White, modifier = Modifier.padding(bottom = 8.dp))
        // Placeholder untuk Line Chart
        Box(
            modifier = Modifier.fillMaxWidth().height(150.dp)
                .clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E1E1E)),
            contentAlignment = Alignment.Center
        ) {
            Text("[ Line Chart Area ]", color = maroon)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Indikator BMI", color = Color.White, modifier = Modifier.padding(bottom = 8.dp))
        // Placeholder untuk Gauge BMI
        Box(
            modifier = Modifier.fillMaxWidth().height(100.dp)
                .clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E1E1E)),
            contentAlignment = Alignment.Center
        ) {
            Text("[ BMI Gauge: 21.5 (Normal) ]", color = Color(0xFFFFB6C1)) // Aksen Pink
        }
    }
}