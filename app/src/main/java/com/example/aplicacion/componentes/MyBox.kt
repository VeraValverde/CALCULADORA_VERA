package com.example.aplicacion.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp

@Composable
fun MyBox(modifier: Modifier= Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(width = 300.dp)
                .height(height = 400.dp)
                .background(Color.Yellow)
                .verticalScroll(state = rememberScrollState())
            )
        Text(text = "fjvhbsdv sibvfipusbni sbfvudinvion sidvbifubo")

    }
}