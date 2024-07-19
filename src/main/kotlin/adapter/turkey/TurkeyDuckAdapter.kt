package adapter.turkey

import strategy.duck.Duck
import strategy.duck.fly.FlyBehaviour
import strategy.duck.quack.QuackBehaviour

data class TurkeyDuckAdapter(
    private val turkey: Turkey,
    private val flyBehaviour: FlyBehaviour,
    private val quackBehaviour: QuackBehaviour
) : Duck {

    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for (i in 0..4) {
            turkey.fly()
        }
    }

    override fun swim() {
        println("I'm swimming")
    }

    override fun updateFlyBehaviour(flyBehaviour: FlyBehaviour): Duck {
        return copy(flyBehaviour = flyBehaviour)
    }

    override fun updateQuackBehaviour(quackBehaviour: QuackBehaviour): Duck {
        return copy(quackBehaviour = quackBehaviour)
    }

    override fun display(): String {
        return "I'm a turkey duck adapter"
    }
}