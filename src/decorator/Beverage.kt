package decorator

import decorator.Beverage.Size.SMALL

abstract class Beverage {
    enum class Size {
        TALL, MEDIUM, SMALL
    }

    var size = SMALL
    abstract var description: String
    abstract fun cost(): Double
}