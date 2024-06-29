package decorator

import org.junit.jupiter.api.Test

class DecoratorTest {

    @Test
    fun test() {
        val espresso = Espresso()
        println("Espresso: ${espresso.description()} $${espresso.cost()}")

        val mocha = Mocha(espresso)
        println("Mocha: ${mocha.description()} $${mocha.cost()}")

        val mochaMocha = Mocha(mocha)
        println("Mocha Mocha: ${mochaMocha.description()} $${mochaMocha.cost()}")

        val caramelMocha = Caramel(mocha)
        println("Caramel Mocha: ${caramelMocha.description()} $${caramelMocha.cost()}")

        val houseBlend = HouseBlend()
        println("House Blend: ${houseBlend.description()} $${houseBlend.cost()}")
    }
}