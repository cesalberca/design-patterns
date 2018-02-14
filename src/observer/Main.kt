package observer

fun main(args: Array<String>) {
    val weatherData = WeatherData()
    CurrentConditionDisplay(weatherData)
    weatherData.temperature = 10.0
    weatherData.pressure = 5
    weatherData.humidity = 4.0
}