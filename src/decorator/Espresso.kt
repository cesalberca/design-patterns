package decorator

class Espresso : Beverage() {

    override var description = "Espresso"
    override fun cost() = 2.0

}