package org.example

const val PI= 3.1416
fun main() {
    val nombre = "Li"

    if (nombre.isNotEmpty()) println("El largo de nuestra variable nombre es ${nombre.length}") else println("La variable nombre esta vacia")

    val mensaje : String = if (nombre.length > 4) {
        "Tu nombre es largo"
    } else if (nombre.isEmpty()) {
        "Tu nombre esta vacio"
    } else {
        "Tienes un nombre corto"
    }
    println(mensaje)
}