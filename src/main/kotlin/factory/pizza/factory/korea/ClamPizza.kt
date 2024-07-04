package factory.pizza.factory.korea

import factory.pizza.Pizza

data object ClamPizza : Pizza {
    override fun prepare() {
        println("Preparing clam pizza")
    }

    override fun bake() {
        println("Baking clam pizza")
    }

    override fun cut() {
        println("Cutting clam pizza")
    }

    override fun box() {
        println("Boxing clam pizza")
    }
}