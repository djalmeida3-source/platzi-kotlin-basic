package org.example

const val PI= 3.1416
fun main() {
    println("Hello World!")
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)

    val nombre = "Maria"
    println(nombre)
    println(PI)

    val boolean = true
    val numeroLargo = 3L
    val duble = 2.7182
    val float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor - segundoValor
    println(tercerValor)

    val apellido = "Almeida"
    val david = "David"
    var nombreCompleto = david + apellido
    println(nombreCompleto)
    nombreCompleto = "Mi nombre es: $david $apellido"
    println(nombreCompleto)
}