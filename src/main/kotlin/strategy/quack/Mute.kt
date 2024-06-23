package strategy.quack

class Mute: QuackBehaviour {
    override fun quack() {
        println("<< Silence >>")
    }
}