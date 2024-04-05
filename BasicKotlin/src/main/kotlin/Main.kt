package org.example

fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei P30", "Xiaomi Mi 10")
        .apply {
            removeIf { movil -> movil.contains("Google") }
        }
    println(moviles)

    val colores : MutableList<String>? = mutableListOf("Rojo", "Verde", "Azul")
    colores?.apply {
        println("Nuestros colores son: $this")
        println("El tamaño de la lista es: $size")
    }
}
