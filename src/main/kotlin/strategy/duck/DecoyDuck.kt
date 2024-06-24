package strategy.duck

import strategy.duck.fly.FlyBehaviour
import strategy.duck.fly.FlyNoWay
import strategy.duck.quack.Mute
import strategy.duck.quack.QuackBehaviour

data class DecoyDuck(
    override val flyBehaviour: FlyBehaviour = FlyNoWay(),
    override val quackBehaviour: QuackBehaviour = Mute()
) : Duck {
    override fun display() = "I'm a decoy duck"
}