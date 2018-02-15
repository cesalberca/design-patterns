package decorator

import decorator.Beverage.Size.MEDIUM

fun main(args: Array<String>) {
    val espresso: Beverage = Espresso()
    val espressoWithMocha = Mocha(espresso)
    espressoWithMocha.size = MEDIUM
    println("${espressoWithMocha.cost()}€ - ${espressoWithMocha.description} - ${espressoWithMocha.size}")
}