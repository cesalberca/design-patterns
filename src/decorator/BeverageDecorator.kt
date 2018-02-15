package decorator

abstract class BeverageDecorator(private val decoratedCoffee: Beverage) : Beverage() {
    override fun cost(): Double = decoratedCoffee.cost()
    override var description: String = decoratedCoffee.description
}