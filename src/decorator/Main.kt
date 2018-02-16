package decorator

import decorator.Beverage.Size.MEDIUM

fun main(args: Array<String>) {

    val espresso: Beverage = Espresso()
    val espressoWithMocha = Mocha(espresso)
    val espressoWithMochaAndMilk = Milk(espressoWithMocha)
    espressoWithMochaAndMilk.size = MEDIUM

    espressoWithMochaAndMilk.run {
        println("${cost()}€ - $description - $size")
    }

}