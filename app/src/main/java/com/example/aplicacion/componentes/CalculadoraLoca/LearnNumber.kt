package com.example.aplicacion.componentes.CalculadoraLoca

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun LearnNumber(numero: String, onValueChange: (String) -> Unit) {
    TextField(
        value = numero,
        onValueChange = { nuevoTexto ->
            val limpio = nuevoTexto.filter { it.isDigit() && it != '5' }
            onValueChange(limpio)
        },
        label = { Text("Número") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}
