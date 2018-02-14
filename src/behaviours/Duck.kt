package behaviours

abstract class Duck {

    open val flyBehaviour: FlyBehaviour = FlyWithWings()

    fun performFly() {
        flyBehaviour.fly()
    }

    abstract fun display()

}