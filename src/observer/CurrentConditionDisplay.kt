package observer

class CurrentConditionDisplay(weatherData: Subject) : Observer {

    private var temperature = 0.0
    private var humidity = 0.0
    private var pressure = 0

    init {
        weatherData.addObserver(this)
    }

    override fun update(subject: Subject) {
        if (subject is WeatherData) {
            this.temperature = subject.temperature
            this.humidity= subject.humidity
            this.pressure = subject.pressure
            display()
        }
    }

    private fun display() {
        println("${humidity}h ${pressure}p ${temperature}ºC")
    }

}