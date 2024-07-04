package factory.pizza.factory.korea

import factory.pizza.Pizza

data object PepperoniPizza : Pizza {
    override fun prepare() {
        println("Preparing pepperoni pizza")
    }

    override fun bake() {
        println("Baking pepperoni pizza")
    }

    override fun cut() {
        println("Cutting pepperoni pizza")
    }

    override fun box() {
        println("Boxing pepperoni pizza")
    }
}