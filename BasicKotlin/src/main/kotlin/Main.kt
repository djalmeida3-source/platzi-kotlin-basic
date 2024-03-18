package org.example

const val PI= 3.1416
fun main() {
    val nombreColor = "Carmesi"

    when (nombreColor) {
        "Amarillo" -> println("El color es amarillo")
        "Rojo","Carmesi" -> println("Este color simboliza el calor")
        else -> println("Error: No tengo informacion del color")
    }

    val code = 404
    when (code) {
        in 200..299 -> println("Todo ha ido bien")
        in 400 .. 500 -> println("Algo ha fallado")
        else -> println("Codigo desconocido, algo ha fallado")
    }

    val tallDeZapatos = 46
    val mensaje = when (tallDeZapatos) {
        41,43 -> "Tenemos disponibles"
        42,44 -> "Casi no nos quedan"
        45 -> "Estamos agotados"
        else -> "Estos zapatos solo vienen en tallas 41,42,43,44 y 45"
    }
    println(mensaje)
}