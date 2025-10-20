package com.example.aplicacion.componentes.CalculadoraLoca

fun evaluarExpresion(exp: String): Int {
    var resultado = 0
    var partes: List<String>

    if (exp.contains("+")) {
        partes = exp.split("+")
        resultado = partes[0].toInt() + partes[1].toInt()
    }

    else if (exp.contains("-")) {
        partes = exp.split("-")
        resultado = partes[0].toInt() - partes[1].toInt()
    }

    else if (exp.contains("*")) {
        partes = exp.split("*")
        resultado = partes[0].toInt() * partes[1].toInt()
    }

    else if (exp.contains("/")) {
        partes = exp.split("/")
        val divisor = partes[1].toInt()

        if (divisor == 0) {

            throw ArithmeticException("No se puede dividir entre 0")
        } else {
            resultado = partes[0].toInt() / divisor
        }
    }

    return resultado
}
