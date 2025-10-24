package com.example.aplicacion.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CalculadoraLoca(modifier: Modifier = Modifier) {
    // Mostrar los numeros que se escriben y el resultado
    var expresion by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    // Números cambiados
    val numeros = mapOf(
        "0" to "2",
        "1" to "3",
        "2" to "4",
        "3" to "6",
        "4" to "7",
        "6" to "8",
        "7" to "9",
        "8" to "0",
        "9" to "1"
    )

    // Operaciones cambiadas
    val operaciones = mapOf(
        "@" to "+",
        "#" to "-",
        "&" to "*",
        "%" to "/"
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            //Mostrar la expresion escrita real
            Text(
                text = expresion,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                textAlign = TextAlign.End,
                fontSize = 26.sp
            )
            //Mostrar resultado
            Text(
                text = if (resultado.isNotEmpty()) "Resultado: $resultado" else "",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                textAlign = TextAlign.End,
                fontSize = 22.sp,
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Crear oden filas
            val filas = listOf(
                listOf("7", "8", "9"),
                listOf("3", "4", "6"),
                listOf("0", "1", "2")
            )

            for (fila in filas) {
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    for (num in fila) {
                        Button(
                            onClick = {
                                val valorReal = numeros[num] ?: num
                                expresion += valorReal
                            },
                            modifier = Modifier
                                .weight(1f)
                                .padding(6.dp)
                                .height(70.dp), // botones más altos
                            shape = MaterialTheme.shapes.small, // Cuadrados
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFD3D3D3) // Gris claro
                            ),
                        ) {
                            Text(text = num, fontSize = 24.sp, color = Color.Black)
                        }
                    }
                }
            }

            // Botones de operaciones
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                for ((simbolo, real) in operaciones) {
                    Button(
                        onClick = { expresion += real },
                        modifier = Modifier
                            .weight(1f)
                            .padding(4.dp)
                            .height(70.dp),
                        shape = MaterialTheme.shapes.small,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFD3D3D3)
                        ),
                    ) {
                        Text(text = simbolo, fontSize = 22.sp, color = Color.Black)
                    }
                }
            }

            // Botones de C y =
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                //Boton limpiar todo
                Button(
                    onClick = {
                        expresion = ""
                        resultado = ""
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(70.dp),
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFB6B6)) // rojo pastel
                ) {
                    Text("C", fontSize = 22.sp, color = Color.Black)
                }
                //Crear resultado y si sale 5 poner un 6
                Button(
                    onClick = {
                        try {
                            val res = evaluarExpresion(expresion)
                            resultado = res.toString().replace("5", "6")
                        } catch (e: Exception) {
                            resultado = "Error"
                        }
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .height(70.dp),
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF81D4FA)) // azul claro
                ) {
                    Text("=", fontSize = 22.sp, color = Color.Black)
                }
            }
        }
    }
}

// Controlar divisiones por 0
fun evaluarExpresion(exp: String): Int {
    var numero = ""
    var operacion = '+'
    var resultado = 0

    for (c in exp) {
        if (c.isDigit()) {
            numero += c
        } else {
            val n = numero.toInt()
            when (operacion) {
                '+' -> resultado += n
                '-' -> resultado -= n
                '*' -> resultado *= n
                '/' -> {
                    if (n == 0) throw ArithmeticException("No se puede dividir entre 0")
                    resultado /= n
                }
            }
            operacion = c
            numero = ""
        }
    }

    // Aplicar el último número
    if (numero.isNotEmpty()) {
        val n = numero.toInt()
        when (operacion) {
            '+' -> resultado += n
            '-' -> resultado -= n
            '*' -> resultado *= n
            '/' -> {
                if (n == 0) throw ArithmeticException("No se puede dividir entre 0")
                resultado /= n
            }
        }
    }

    return resultado
}

