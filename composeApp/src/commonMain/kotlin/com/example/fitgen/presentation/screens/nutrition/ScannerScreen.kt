package com.example.fitgen.presentation.screens.nutrition

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ScannerScreen() {
    val maroon = Color(0xFF800000)

    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        // Placeholder Camera Preview
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Camera Preview Area", color = Color.Gray)
        }

        // Tombol Ambil Foto
        Button(
            onClick = { /* Implementasi jepret gambar */ },
            modifier = Modifier.align(Alignment.BottomCenter).padding(32.dp).size(80.dp),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(containerColor = maroon)
        ) {
            Text("Foto", color = Color.White)
        }
    }
}