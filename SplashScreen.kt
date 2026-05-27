package com.Olivarez.discoveryapp.ui

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onTimeout: () -> Unit) {
    val scale = remember { Animatable(0f) }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1.2f,
            animationSpec = tween(durationMillis = 800)
        )
        scale.animateTo(
            targetValue = 1.0f,
            animationSpec = tween(durationMillis = 400)
        )
        delay(1500)
        onTimeout()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212)), // Corregido: Ahora es un color hexadecimal válido
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "INGENIERÍA EN\nSISTEMAS",
                style = MaterialTheme.typography.headlineLarge,
                color = Color(0xFF00FFCC),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.scale(scale.value)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Cargando futuro...",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.LightGray
            )
        }
    }
}