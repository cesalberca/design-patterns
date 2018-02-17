package simplefactory

class CheesePizza: Pizza() {

    init {
        name = "Cheese"
        dough = "Crust"
        sauce = "Cheese"
        toppings.add("Even more cheese")
    }

    override fun cut() {
        println("Cutting corners")
    }

}