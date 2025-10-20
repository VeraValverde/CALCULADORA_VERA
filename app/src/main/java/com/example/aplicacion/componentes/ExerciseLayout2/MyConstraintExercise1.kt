package com.example.aplicacion.componentes.ExerciseLayout2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun MyConstraintExercise1(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (red, blue, green, yellow) = createRefs()

        Box(
            modifier = Modifier
                .height(80.dp)
                .background(Color.Red)
                .constrainAs(red) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Blue)
                .constrainAs(blue) {
                    top.linkTo(red.bottom)
                    start.linkTo(parent.start)
                }
        )

        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Green)
                .constrainAs(green) {
                    top.linkTo(red.bottom)
                    end.linkTo(parent.end)
                }
        )

        Box(
            modifier = Modifier
                .height(120.dp)
                .background(Color.Yellow)
                .constrainAs(yellow) {
                    top.linkTo(red.bottom)
                    start.linkTo(blue.end)
                    end.linkTo(green.start)
                    width = Dimension.fillToConstraints
                }
        )
    }
}