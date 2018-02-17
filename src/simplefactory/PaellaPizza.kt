package simplefactory

class PaellaPizza : Pizza() {

    init {
        name = "Paella"
        dough = "Thin"
        sauce = "Weird"
        toppings.add("Rabbit")
        toppings.add("Sausage")
    }

}