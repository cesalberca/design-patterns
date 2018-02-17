package simplefactory

class SimplePizzaFactory {

    fun createPizza(type: String): Pizza = when(type) {
        "cheese" -> CheesePizza()
        "paella" -> PaellaPizza()
        else -> throw RuntimeException("No pizza :(")
    }

}