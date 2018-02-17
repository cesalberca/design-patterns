package simplefactory

fun main(args: Array<String>) {
    val pizzaStore = PizzaStore(SimplePizzaFactory())
    val pizza: Pizza = pizzaStore.orderPizza("paella")
    println(pizza.toString())
}