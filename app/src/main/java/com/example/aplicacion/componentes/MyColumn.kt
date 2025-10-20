package com.example.aplicacion.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyColumn(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Color01")
        Text(text = "Color02")
        Text(text = "Color03")
        Text(text = "Color04")
        Text(text = "Color05")
    }
}