package strategy.duck

import strategy.duck.fly.FlyBehaviour
import strategy.duck.fly.Wing
import strategy.duck.quack.Quack
import strategy.duck.quack.QuackBehaviour

data class MallardDuck(
    private val flyBehaviour: FlyBehaviour = Wing(),
    private val quackBehaviour: QuackBehaviour = Quack()
) : Duck,
    FlyBehaviour by flyBehaviour,
    QuackBehaviour by quackBehaviour {

    override fun display(): String = "I'm a real Mallard duck"

    override fun swim() {
        println("All ducks float, even decoys!")
    }

    override fun updateFlyBehaviour(flyBehaviour: FlyBehaviour): Duck =
        copy(flyBehaviour = flyBehaviour)

    override fun updateQuackBehaviour(quackBehaviour: QuackBehaviour): Duck =
        copy(quackBehaviour = quackBehaviour)
}

