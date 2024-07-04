package factory.pizza.factory.korea

import factory.pizza.Pizza

data object CheesePizza : Pizza {
    override fun prepare() {
        println("Preparing cheese pizza")
    }

    override fun bake() {
        println("Baking cheese pizza")
    }

    override fun cut() {
        println("Cutting cheese pizza")
    }

    override fun box() {
        println("Boxing cheese pizza")
    }
}