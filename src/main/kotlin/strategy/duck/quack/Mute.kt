package strategy.duck.quack

class Mute: QuackBehaviour {
    override fun quack() {
        println("<< Silence >>")
    }
}