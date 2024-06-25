package strategy.duck

import strategy.duck.fly.FlyBehaviour
import strategy.duck.quack.QuackBehaviour

interface Duck {
    fun display(): String

    fun fly()

    fun quack()

    fun swim()

    fun updateFlyBehaviour(flyBehaviour: FlyBehaviour): Duck

    fun updateQuackBehaviour(quackBehaviour: QuackBehaviour): Duck
}