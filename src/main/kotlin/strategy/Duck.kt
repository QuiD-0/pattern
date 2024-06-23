package strategy

import strategy.fly.FlyBehaviour
import strategy.quack.QuackBehaviour

interface Duck {
    val quackBehaviour: QuackBehaviour
    val flyBehaviour: FlyBehaviour

    fun display() : String

    fun fly() {
        flyBehaviour.fly()
    }

    fun quack() {
        quackBehaviour.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

    fun updateFlyBehaviour(flyBehaviour: FlyBehaviour): Duck
    fun updateQuackBehaviour(quackBehaviour: QuackBehaviour): Duck
}