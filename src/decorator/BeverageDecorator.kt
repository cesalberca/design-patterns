package decorator

abstract class BeverageDecorator(private val decoratedCoffee: Beverage) : Beverage() {

    override fun cost() = decoratedCoffee.cost()
    override var description = decoratedCoffee.description

}