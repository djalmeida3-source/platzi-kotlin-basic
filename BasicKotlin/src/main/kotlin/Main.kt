package org.example

fun main() {
    var nombre :String? = null
    try {
        throw NullPointerException("Referencia nula")
    } catch (e:NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error... Cerrando aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor } catch (e: Exception) { 0 }
    println(resultado)
}