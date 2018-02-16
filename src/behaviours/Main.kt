package behaviours

fun main(args: Array<String>) {

    val rubberDuck = RubberDuck()

    rubberDuck.flyBehaviour = FlyWithWings()
    rubberDuck.performFly()
    
}