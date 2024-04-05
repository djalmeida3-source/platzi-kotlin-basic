package org.example

fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei P30", "Xiaomi Mi 10")
        .run {
            removeIf { movil -> movil.contains("Google") }
            this
        }
    println(moviles)
}
