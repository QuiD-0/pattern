package strategy.duck

import strategy.duck.fly.FlyBehaviour
import strategy.duck.fly.FlyNoWay
import strategy.duck.quack.Mute
import strategy.duck.quack.QuackBehaviour

data class DecoyDuck(
    private val flyBehaviour: FlyBehaviour = FlyNoWay(),
    private val quackBehaviour: QuackBehaviour = Mute()
) : Duck  {
    override fun display() = "I'm a decoy duck"

    override fun fly() {
        flyBehaviour.fly()
    }

    override fun quack() {
        quackBehaviour.quack()
    }

    override fun swim() {
        println("All ducks float, even decoys!")
    }

    override fun updateFlyBehaviour(flyBehaviour: FlyBehaviour): Duck =
        copy(flyBehaviour = flyBehaviour)

    override fun updateQuackBehaviour(quackBehaviour: QuackBehaviour): Duck =
        copy(quackBehaviour = quackBehaviour)
}