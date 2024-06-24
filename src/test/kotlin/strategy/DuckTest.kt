package strategy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import strategy.duck.DecoyDuck
import strategy.duck.MallardDuck
import strategy.duck.fly.Rocket
import strategy.duck.quack.Mute

class DuckTest{

    @Test
    fun testMallardDuck(){
        val duck = MallardDuck()
        duck.fly()
        duck.quack()
        duck.swim()
        assertEquals("I'm a real Mallard duck", duck.display())
    }

    @Test
    fun testDecoyDuck(){
        val duck = DecoyDuck()
        duck.fly()
        duck.quack()
        duck.swim()
        assertEquals("I'm a decoy duck", duck.display())
    }

    @Test
    fun updateFlyBehavior(){
        val duck = MallardDuck()
        duck.fly()
        val updateFlyBehaviour = duck.updateFlyBehaviour(Rocket())
        updateFlyBehaviour.fly()
    }

    @Test
    fun updateQuackBehavior(){
        val duck = MallardDuck()
        duck.quack()
        val updateQuackBehaviour = duck.updateQuackBehaviour(Mute())
        updateQuackBehaviour.quack()
    }
}