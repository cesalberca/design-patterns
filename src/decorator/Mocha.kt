package decorator

class Mocha(private val beverage: Beverage) : BeverageDecorator(beverage) {
    override var description: String = "${beverage.description} with Mocha"
    override fun cost() = beverage.cost() + 0.20
}