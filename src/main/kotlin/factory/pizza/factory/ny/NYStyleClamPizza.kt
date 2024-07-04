package factory.pizza.factory.ny

import factory.pizza.Pizza

data object NYStyleClamPizza : Pizza {
    override fun prepare() {
        println("Preparing NY style clam pizza")
    }

    override fun bake() {
        println("Baking NY style clam pizza")
    }

    override fun cut() {
        println("Cutting NY style clam pizza")
    }

    override fun box() {
        println("Boxing NY style clam pizza")
    }
}