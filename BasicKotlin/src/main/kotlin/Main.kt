package org.example

fun main() {
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!") { valor ->
        valor.length
    }
    println(largoDelValorInicial)

    val lambda = funcionInception("David")
    val valorLambda: String = lambda()
    println(valorLambda)
}

fun superFuncion(valorInicial: String, block : (String) -> Int): Int {
    return block(valorInicial)
}

fun funcionInception(nombre : String) : () -> String {
    return {
        "Hola desde la lambda ${nombre}"
    }
}