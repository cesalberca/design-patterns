package decorator

class Milk(private val beverage: Beverage) : BeverageDecorator(beverage) {

    override var description = "${beverage.description} with Milk"
    override fun cost() = beverage.cost() + 0.30

}