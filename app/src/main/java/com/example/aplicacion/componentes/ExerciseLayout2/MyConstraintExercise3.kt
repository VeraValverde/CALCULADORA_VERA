package com.example.aplicacion.componentes.ExerciseLayout2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.compose.atMost

@Composable
fun MyConstraintExercise3(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (card, darkGray, midGray, lightGray) = createRefs()

        Box(
            modifier = Modifier
                .height(200.dp)
                .background(Color(0xFF9C27B0))
                .constrainAs(card) {
                    top.linkTo(parent.top, margin = 16.dp)
                    bottom.linkTo(parent.bottom, margin = 16.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                    end.linkTo(parent.end, margin = 16.dp)
                    width = Dimension.preferredWrapContent
                        .atMost(420.dp)
                    verticalBias = 0.4f
                }
        )

        val footerBoxes = listOf(darkGray, midGray, lightGray)

        Box(
            modifier = Modifier
                .height(56.dp)
                .background(Color.DarkGray)
                .constrainAs(darkGray) {
                    bottom.linkTo(parent.bottom, 16.dp)
                    start.linkTo(parent.start)
                }
        )
        Box(
            modifier = Modifier
                .height(56.dp)
                .background(Color.Gray)
                .constrainAs(midGray) {
                    bottom.linkTo(parent.bottom, 16.dp)
                    start.linkTo(darkGray.end)
                }
        )
        Box(
            modifier = Modifier
                .height(56.dp)
                .background(Color.LightGray)
                .constrainAs(lightGray) {
                    bottom.linkTo(parent.bottom, 16.dp)
                    start.linkTo(midGray.end)
                    end.linkTo(parent.end)
                }
        )

        createHorizontalChain(darkGray, midGray, lightGray, chainStyle = ChainStyle.SpreadInside)
    }
}
