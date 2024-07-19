package facade.homeTheater.component

class Tuner {
    fun on() {
        println("Tuner on")
    }

    fun off() {
        println("Tuner off")
    }

    fun setAm() {
        println("Tuner set AM")
    }

    fun setFm() {
        println("Tuner set FM")
    }

    fun setFrequency(frequency: Double) {
        println("Tuner set frequency $frequency")
    }
}