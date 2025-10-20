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
fun MyConstraintExercise2(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val guideline33 = createGuidelineFromStart(0.33f)
        val guideline66 = createGuidelineFromStart(0.66f)

        val (a, b, c, d, e, f) = createRefs()

        val boxHeight = 100.dp
        val margin = 8.dp

        Box(
            modifier = Modifier
                .height(boxHeight)
                .background(Color.Red)
                .constrainAs(a) {
                    top.linkTo(parent.top, margin)
                    start.linkTo(parent.start, margin)
                    end.linkTo(guideline33, margin)
                    width = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .height(boxHeight)
                .background(Color.Blue)
                .constrainAs(b) {
                    top.linkTo(a.top)
                    start.linkTo(guideline33, margin)
                    end.linkTo(guideline66, margin)
                    width = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .height(boxHeight)
                .background(Color.Green)
                .constrainAs(c) {
                    top.linkTo(a.top)
                    start.linkTo(guideline66, margin)
                    end.linkTo(parent.end, margin)
                    width = Dimension.fillToConstraints
                }
        )

        // Fila 2
        Box(
            modifier = Modifier
                .height(boxHeight)
                .background(Color.Yellow)
                .constrainAs(d) {
                    top.linkTo(a.bottom, 12.dp)
                    start.linkTo(parent.start, margin)
                    end.linkTo(guideline33, margin)
                    width = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .height(boxHeight)
                .background(Color.Magenta)
                .constrainAs(e) {
                    top.linkTo(d.top)
                    start.linkTo(guideline33, margin)
                    end.linkTo(guideline66, margin)
                    width = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .height(boxHeight)
                .background(Color.Cyan)
                .constrainAs(f) {
                    top.linkTo(d.top)
                    start.linkTo(guideline66, margin)
                    end.linkTo(parent.end, margin)
                    width = Dimension.fillToConstraints
                }
        )
    }
}
