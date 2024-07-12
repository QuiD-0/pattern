package command.remoteController.tv

interface Tv {
    fun on()
    fun off()
}

class LivingRoomTv : Tv {
    override fun on() {
        println("Living room TV is on")
    }

    override fun off() {
        println("Living room TV is off")
    }
}

class BedRoomTv : Tv {
    override fun on() {
        println("Bed room TV is on")
    }

    override fun off() {
        println("Bed room TV is off")
    }
}