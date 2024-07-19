package facade.homeTheater.component

class DvdPlayer {
    fun on() {
        println("DvdPlayer on")
    }

    fun off() {
        println("DvdPlayer off")
    }

    fun play(movie: String) {
        println("DvdPlayer play $movie")
    }

    fun stop() {
        println("DvdPlayer stop")
    }

    fun eject() {
        println("DvdPlayer eject")
    }
}