package facade.homeTheater.component

class CdPlayer {
    fun on() {
        println("CdPlayer on")
    }

    fun off() {
        println("CdPlayer off")
    }

    fun play(cd: String) {
        println("CdPlayer play $cd")
    }

    fun stop() {
        println("CdPlayer stop")
    }

    fun eject() {
        println("CdPlayer eject")
    }
}