package decorator

class Milk(private val beverage: Beverage) : BeverageDecorator(beverage) {
    override var description: String = "${beverage.description} with Milk"
    override fun cost(): Double = beverage.cost() + 0.30
}