package strategy.duck

import strategy.duck.fly.FlyBehaviour
import strategy.duck.fly.Wing
import strategy.duck.quack.Quack
import strategy.duck.quack.QuackBehaviour

data class MallardDuck(
    override val flyBehaviour: FlyBehaviour = Wing(),
    override val quackBehaviour: QuackBehaviour = Quack()
) : Duck {
    override fun display(): String = "I'm a real Mallard duck"
}

