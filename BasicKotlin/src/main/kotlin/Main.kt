package org.example

const val PI= 3.1416
fun main() {
    var contador = 10
    while (contador > 0) {
        println("El valor del contador es $contador")
        contador--
    }

    do {
        println("Generando numeros aleatorios...")
        val numeroAleatorio = (0..100).random()
        println("El numero generado es $numeroAleatorio")
    } while (numeroAleatorio > 50)
}