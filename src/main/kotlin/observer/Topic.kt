package observer

interface Topic {
    fun subscribe(observer: Observer)
    fun unSubscribe(observer: Observer)
    fun push()
}

class WeatherData : Topic {
    private val observers = mutableListOf<Observer>()
    private var temperature = 0.0f
    private var humidity = 0.0f
    private var pressure = 0.0f

    override fun subscribe(observer: Observer) {
        observers.add(observer)
    }

    override fun unSubscribe(observer: Observer) {
        observers.remove(observer)
    }

    // fan out
    override fun push() {
        observers.forEach { it.update(temperature, humidity, pressure) }
    }

    fun updateData(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        push()
    }
}