package com.example.aplicacion.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyCompleteLayout(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        // Caja Roja
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red)
        )

        // Caja Azul
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue)
        ) {
            Row(modifier = Modifier.fillMaxSize()) {
                // Caja Negra
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(Color.Black)
                )

                // Columna con Verde y Gris
                Column(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxHeight()
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .background(Color.Green),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Verde")
                    }
                    Box(
                        modifier = Modifier
                            .weight(0.3f) // mejor que 0.1f, para que se vea
                            .fillMaxWidth()
                            .background(Color.Gray),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Gris")
                    }
                }
            }
        }

        // Caja Amarilla
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Yellow)
        )
    }
}
