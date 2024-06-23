package strategy

import strategy.fly.FlyBehaviour
import strategy.fly.Wing
import strategy.quack.Quack
import strategy.quack.QuackBehaviour

data class MallardDuck(
    override val flyBehaviour: FlyBehaviour = Wing(),
    override val quackBehaviour: QuackBehaviour = Quack()
) : Duck {
    override fun display(): String = "I'm a real Mallard duck"
}

