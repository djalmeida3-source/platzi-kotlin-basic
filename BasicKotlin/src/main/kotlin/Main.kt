package org.example

fun main() {
    val edaDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Captain America" to 99
    )
    println(edaDeSuperHeroes)

    val edadSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Captain America" to 99
    )
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable.put("Wolverine", 45)
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)

    val edadIronman = edadSuperHeroesMutable["Ironman"]
    println(edadIronman)

    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)

    println(edadSuperHeroesMutable.keys)
    println(edadSuperHeroesMutable.values)
}