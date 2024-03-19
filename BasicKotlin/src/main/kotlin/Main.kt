package org.example

const val PI= 3.1416
fun main() {
    val listaDeFrutas: List<String> = listOf("Manzana","Pera","Frambuesa","Durazno")
    for (fruta in listaDeFrutas) println("Hoy voy a comer una fruta llamada $fruta")

    listaDeFrutas.forEach { fruta -> println("Hoy voy a comer una fruta nueva llamada $fruta") }

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { caracteres -> caracteres > 5 }
    println(listaFiltrada)

}