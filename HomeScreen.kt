package com.Olivarez.discoveryapp.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

// Clase de datos para las áreas de la infografía
data class AreaConocimiento(val titulo: String, val descripcion: String)

@OptIn(ExperimentalMaterial3Api::class) // Necesario para usar la TopAppBar de Material 3
@Composable
fun HomeScreen(
    onNavigateToTest: () -> Unit,
    onNavigateToLaboral: () -> Unit,
    onNavigateToEspecialidades: () -> Unit,
    onNavigateToContacto: () -> Unit
) {
    val areas = listOf(
        AreaConocimiento("🤖 Inteligencia Artificial", "Aprende a entrenar redes neuronales, automatizar procesos y crear el software del mañana."),
        AreaConocimiento("🛡️ Ciberseguridad", "Conviértete en un hacker ético protegiendo datos e infraestructuras contra ataques globales."),
        AreaConocimiento("💻 Programación Avanzada", "Domina múltiples lenguajes de desarrollo para crear aplicaciones y videojuegos multiplataforma."),
        AreaConocimiento("☁️ Redes y Cloud Computing", "Diseña la arquitectura en la nube de grandes corporaciones usando AWS, Azure o Google Cloud.")
    )

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Descubre ISC", fontWeight = FontWeight.Bold) })
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Text(
                    text = "Áreas Temáticas",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Toca cualquier tarjeta para expandir la información:",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(8.dp))
            }

            items(areas) { area ->
                ExpandableCard(titulo = area.titulo, descripcion = area.descripcion)
            }

            item {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Dinámicas Interactivas",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(12.dp))

                Button(onClick = onNavigateToTest, modifier = Modifier.fillMaxWidth()) {
                    Text("🎯 Hacer Test Vocacional (5 Preguntas)")
                }
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedButton(onClick = onNavigateToLaboral, modifier = Modifier.fillMaxWidth()) {
                    Text("💼 Ver Campo Laboral")
                }
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedButton(onClick = onNavigateToEspecialidades, modifier = Modifier.fillMaxWidth()) {
                    Text("🗺️ Mapa de Especialidades")
                }
                Spacer(modifier = Modifier.height(8.dp))
                ElevatedButton(onClick = onNavigateToContacto, modifier = Modifier.fillMaxWidth()) {
                    Text("📱 Contacto Directo y QR")
                }
            }
        }
    }
}

@Composable
fun ExpandableCard(titulo: String, descripcion: String) {
    var expandida by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { expandida = !expandida }
            .animateContentSize(), // Corregido el comportamiento de la animación
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = titulo, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.SemiBold)
            if (expandida) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = descripcion, style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}