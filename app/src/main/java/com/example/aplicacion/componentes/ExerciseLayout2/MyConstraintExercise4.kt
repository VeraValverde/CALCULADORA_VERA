package com.example.aplicacion.componentes.ExerciseLayout2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.widget.ConstraintLayout

@Composable
fun MyConstraintExercise4(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (cyan, turquoise, aquamarine, orange, black) = createRefs()

        Box(
            modifier = Modifier
                .height(120.dp)
                .background(Color.Cyan)
                .constrainAs(cyan) {
                    top.linkTo(parent.top, 16.dp)
                    start.linkTo(parent.start, 16.dp)
                    end.linkTo(parent.end, 16.dp)
                }
        )
        Box(
            modifier = Modifier
                .height(180.dp)
                .background(Color(0xFF40E0D0)) // Turquesa
                .constrainAs(turquoise) {
                    top.linkTo(cyan.bottom, 12.dp)
                    start.linkTo(parent.start, 16.dp)
                    end.linkTo(parent.end, 16.dp)
                }
        )
        Box(
            modifier = Modifier
                .height(120.dp)
                .background(Color(0xFF7FFFD4)) // Aguamarina
                .constrainAs(aquamarine) {
                    top.linkTo(turquoise.bottom, 12.dp)
                    start.linkTo(parent.start, 16.dp)
                    end.linkTo(parent.end, 16.dp)
                }
        )

        val bottomBarrier = createBottomBarrier(cyan, turquoise, aquamarine)

        Box(
            modifier = Modifier
                .height(48.dp)
                .background(Color(0xFFFFA500))
                .constrainAs(orange) {
                    top.linkTo(bottomBarrier, 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    bottom.linkTo(black.top, 8.dp)
                }
        )

        Box(
            modifier = Modifier
                .height(48.dp)
                .background(Color.Black)
                .constrainAs(black) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                }
        )
    }
}
