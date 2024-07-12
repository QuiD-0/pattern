package command.remoteController.light

interface Light {
    fun on()
    fun off()
}

class MainLight : Light {
    override fun on() {
        println("Main light is on")
    }

    override fun off() {
        println("Main light is off")
    }
}

class BedRoomLight : Light {
    override fun on() {
        println("Bed room light is on")
    }

    override fun off() {
        println("Bed room light is off")
    }
}

class KitchenLight : Light {
    override fun on() {
        println("Kitchen light is on")
    }

    override fun off() {
        println("Kitchen light is off")
    }
}