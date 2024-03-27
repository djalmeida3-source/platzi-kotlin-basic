package org.example

fun main() {
    imprimirNombre(nombre = "David", apellido = "Almeida")
}

fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String) {
    println("Mi nombre completo es: $nombre $segundoNombre $apellido")
}