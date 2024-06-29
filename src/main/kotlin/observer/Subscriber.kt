package observer

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}

interface DisplayElement {
    fun display()
}

class CurrentConditionsDisplay(
    private var temperature: Float = 0.0f,
    private var humidity: Float = 0.0f,
    private var pressure: Float = 0.0f
) : Observer, DisplayElement {

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity% humidity")
    }
}

class OnlyTemperatureDisplay : Observer, DisplayElement {
    private var temperature = 0.0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        display()
    }

    override fun display() {
        println("Statistics: $temperature C degrees")
    }
}