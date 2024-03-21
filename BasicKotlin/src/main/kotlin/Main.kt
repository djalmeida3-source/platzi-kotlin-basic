package org.example

fun main() {
    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)
}

fun imprimirFrase(frase: String) : Unit {
    println("Tu frase es: $frase")
}

fun String.randomCase(): String {
    val numeroAleatorio = (0..99).random()
    if (numeroAleatorio.rem(2) == 0) {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}