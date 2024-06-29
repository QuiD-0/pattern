package observer

import org.junit.jupiter.api.Test

class SubscribeTest {
    @Test
    fun subscribe() {
        val weatherData = WeatherData()
        val currentConditionsDisplay = CurrentConditionsDisplay()
        weatherData.subscribe(currentConditionsDisplay)

        weatherData.updateData(80.0f, 65.0f, 30.4f)
        weatherData.updateData(82.0f, 70.0f, 29.2f)

        weatherData.unSubscribe(currentConditionsDisplay)
        weatherData.updateData(78.0f, 90.0f, 29.2f)
    }
}