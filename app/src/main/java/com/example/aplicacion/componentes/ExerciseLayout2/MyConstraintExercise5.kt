/*package com.example.aplicacion.componentes.ExerciseLayout2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyConstraintExercise5(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        // Guidelines
        val v40 = createGuidelineFromStart(0.4f)
        val v70 = createGuidelineFromStart(0.7f)
        val h30 = createGuidelineFromTop(0.3f)

        val (header, col1Box1, col1Box2,
            col2Box1, col2Box2, col2Box3,
            col3, redBar, footer1, footer2, footer3) = createRefs()

        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .constrainAs(header) {
                    top.linkTo(parent.top)
                    bottom.linkTo(h30)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )

        // Columna 1 (dos cajas en chain vertical PACKED)
        Box(
            modifier = Modifier
                .height(120.dp)
                .background(Color(0xFF000080)) // Azul marino
                .constrainAs(col1Box1) {
                    top.linkTo(h30)
                    start.linkTo(parent.start)
                    end.linkTo(v40)
                    width = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .height(180.dp)
                .background(Color(0xFF0000CD)) // Azul medio
                .constrainAs(col1Box2) {
                    top.linkTo(col1Box1.bottom, 12.dp)
                    start.linkTo(parent.start)
                    end.linkTo(v40)
                    width = Dimension.fillToConstraints
                }
        )
        createVerticalChain(col1Box1, col1Box2, chainStyle = ChainStyle.Packed)

        // Columna 2 (tres cajas con weights)
        Box(
            modifier = Modifier
                .background(Color(0xFF006400)) // Verde oscuro
                .constrainAs(col2Box1) {
                    top.linkTo(h30)
                    start.linkTo(v40, 12.dp)
                    end.linkTo(v70, 12.dp)
                    height = Dimension.wrapContent
                    width = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .background(Color.Green)
                .constrainAs(col2Box2) {
                    top.linkTo(col2Box1.bottom)
                    start.linkTo(v40, 12.dp)
                    end.linkTo(v70, 12.dp)
                    height = Dimension.wrapContent
                    width = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .background(Color(0xFF90EE90)) // Verde claro
                .constrainAs(col2Box3) {
                    top.linkTo(col2Box2.bottom)
                    start.linkTo(v40, 12.dp)
                    end.linkTo(v70, 12.dp)
                    height = Dimension.wrapContent
                    width = Dimension.fillToConstraints
                }
        )
        createVerticalChain(col2Box1, col2Box2, col2Box3, chainStyle = ChainStyle.Spread)

        // Columna 3 (caja amarilla alta)
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .constrainAs(col3) {
                    top.linkTo(h30)
                    start.linkTo(v70, 12.dp)
                    end.linkTo(parent.end, 12.dp)
                    bottom.linkTo(parent.bottom, 72.dp)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        // Barrier inferior del cuerpo
        val bottomBarrier = createBottomBarrier(col1Box2, col2Box3)

        // Franja roja debajo del contenido variable
        Box(
            modifier = Modifier
                .height(40.dp)
                .background(Color.Red)
                .constrainAs(redBar) {
                    top.linkTo(bottomBarrier, 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                }
        )

        // Footer (tres cajas grises en chain horizontal)
        Box(
            modifier = Modifier
                .height(56.dp)
                .background(Color.DarkGray)
                .constrainAs(footer1) {
                    bottom.linkTo(parent.bottom, 16.dp)
                }
        )
        Box(
            modifier = Modifier
                .height(56.dp)
                .background(Color.Gray)
                .constrainAs(footer2) {
                    bottom.linkTo(parent.bottom, 16.dp)
                }
        )
        Box(
            modifier = Modifier
                .height(56.dp)
                .background(Color.LightGray)
                .constrainAs(footer3) {
                    bottom.linkTo(parent.bottom, 16.dp)
                }
        )
        createHorizontalChain(footer1, footer2, footer3, chainStyle = ChainStyle.Packed)
    }
}

fun createGuidelineFromTop(f: Float) {}

fun createGuidelineFromStart(f: Float) {}

@Composable
fun ConstraintLayout(modifier: fillMaxSize, content: @Composable () -> createHorizontalChain) {
    TODO("Not yet implemented")
}*/
