package decorator

class Espresso : Beverage() {
    override var description: String = "Espresso"
    override fun cost(): Double = 1.99
}