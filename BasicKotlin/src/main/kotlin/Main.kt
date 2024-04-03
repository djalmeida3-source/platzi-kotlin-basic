package org.example

fun main() {
    var nombre : String? = null
    nombre?.let {
        valor -> println("El nombre no es nulo, es ${valor}")
    }
    nombre = "David"
    nombre?.let {
        valor -> println("El nombre no es nulo, es ${valor}")
    }
}
