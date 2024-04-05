package org.example

fun main() {
    val colores = listOf("rojo", "azul", "verde")
    with(colores) {
        println("Nuestros colores son $this")
        println("La longitud de la lista es $size")
    }
}
