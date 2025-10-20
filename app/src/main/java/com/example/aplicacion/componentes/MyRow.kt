package com.example.aplicacion.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyRow(modifier: Modifier = Modifier){
    Row(
        modifier = modifier
            .fillMaxWidth() //ocupa el ancho posible
            .horizontalScroll(state = rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
    ){
        Ficha("Row 01", Color.Blue)
        Ficha("Row 02", Color.Yellow)
        Ficha("Row 03", Color.White)
        Ficha("Row 04", Color.Gray)
        Ficha("Row 05", Color.Green)
    }
}


@Composable
fun Ficha(texto :String, color: Color) =
    Box(
        modifier = Modifier
            .width(180.dp) //fuerza ancha suficiente
            .height(100.dp)
            .background(color),
        contentAlignment = Alignment.Center
    ){

    }