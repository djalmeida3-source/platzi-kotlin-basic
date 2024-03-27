package org.example

fun main() {
    val myLambda : (String) -> Int = {
        valor -> valor.length
    }
    val lambdaEjecutada = myLambda("Hola Platzi")
    println(lambdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)
}
