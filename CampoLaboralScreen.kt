package com.Olivarez.discoveryapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoLaboralScreen(onBack: () -> Unit) { // <-- Parámetro onBack agregado
    val puestos = listOf(
        "Desarrollador de Software (Mobile/Web)",
        "Especialista en Ciberseguridad",
        "Arquitecto de Soluciones Cloud",
        "Ingeniero de Datos e IA",
        "Administrador de Infraestructura TI"
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Campo Laboral", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Regresar")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                text = "Mercado Laboral para ISC",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Áreas de alta demanda donde podrás trabajar al egresar:",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(puestos) { puesto ->
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "💼 $puesto",
                            modifier = Modifier.padding(16.dp),
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}