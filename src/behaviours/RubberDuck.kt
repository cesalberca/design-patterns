package behaviours

class RubberDuck : Duck() {

    override var flyBehaviour: FlyBehaviour = FlyNoWay()

    override fun display() {
        println("I'm a rubber duck")
    }

}