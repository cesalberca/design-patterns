package observer

interface Subject {

    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()

}