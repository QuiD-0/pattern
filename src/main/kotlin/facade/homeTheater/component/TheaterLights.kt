package facade.homeTheater.component

class TheaterLights {
    fun on() {
        println("TheaterLights on")
    }

    fun off() {
        println("TheaterLights off")
    }

    fun dim(level: Int) {
        println("TheaterLights dim $level")
    }
}