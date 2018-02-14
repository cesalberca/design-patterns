package observer

class WeatherData : Subject {

    var temperature = 16.7
        set(value) {
            field = value
            notifyObservers()
        }

    var humidity = 0.5
        set(value) {
            field = value
            notifyObservers()
        }

    var pressure = 19
        set(value) {
            field = value
            notifyObservers()
        }

    private val observers: MutableList<Observer> = ArrayList()

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(this)
        }
    }

}