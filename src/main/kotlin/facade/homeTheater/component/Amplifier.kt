package facade.homeTheater.component

class Amplifier {
    fun on() {
        println("Amplifier on")
    }

    fun off() {
        println("Amplifier off")
    }

    fun setStereoSound() {
        println("Amplifier set stereo sound")
    }

    fun setSurroundSound() {
        println("Amplifier set surround sound")
    }

    fun setVolume(level: Int) {
        println("Amplifier set volume $level")
    }
}