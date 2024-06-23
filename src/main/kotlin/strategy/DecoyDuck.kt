package strategy

import strategy.fly.FlyBehaviour
import strategy.fly.FlyNoWay
import strategy.quack.Mute
import strategy.quack.QuackBehaviour

data class DecoyDuck(
    override val flyBehaviour: FlyBehaviour = FlyNoWay(),
    override val quackBehaviour: QuackBehaviour = Mute()
): Duck {
    override fun display() = "I'm a decoy duck"
    override fun updateFlyBehaviour(flyBehaviour: FlyBehaviour): Duck =
        this.copy(flyBehaviour = flyBehaviour)

    override fun updateQuackBehaviour(quackBehaviour: QuackBehaviour): Duck =
        this.copy(quackBehaviour = quackBehaviour)

}