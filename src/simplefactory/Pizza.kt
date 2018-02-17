package simplefactory

abstract class Pizza(
    var name: String = "",
    var dough: String = "",
    var sauce: String = "",
    var toppings: MutableList<String> = mutableListOf()
) {

    fun prepare() {
        println("Preparing the pizza")
    }

    open fun cut() {
        println("Cutting")

    }

    fun box() {
        println("Boxing")
    }

    override fun toString(): String {
        return """
        |Ingredients:
        |    - $name
        |    - $dough
        |    - $sauce
        |Toppings:
        |${toppings.joinToString(separator = "\n") { "\t* $it" }}
        """.trimMargin()
    }

}