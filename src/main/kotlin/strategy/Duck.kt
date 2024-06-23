package strategy

import strategy.fly.FlyBehaviour
import strategy.quack.QuackBehaviour

sealed interface Duck {
    val quackBehaviour: QuackBehaviour
    val flyBehaviour: FlyBehaviour

    fun display(): String

    fun fly() {
        flyBehaviour.fly()
    }

    fun quack() {
        quackBehaviour.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

    fun updateFlyBehaviour(flyBehaviour: FlyBehaviour): Duck =
        when (this) {
            is MallardDuck -> this.copy(flyBehaviour = flyBehaviour)
            is DecoyDuck -> this.copy(flyBehaviour = flyBehaviour)
        }

    fun updateQuackBehaviour(quackBehaviour: QuackBehaviour): Duck =
        when (this) {
            is MallardDuck -> this.copy(quackBehaviour = quackBehaviour)
            is DecoyDuck -> this.copy(quackBehaviour = quackBehaviour)
        }
}