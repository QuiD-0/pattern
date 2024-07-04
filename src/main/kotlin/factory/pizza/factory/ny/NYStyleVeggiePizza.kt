package factory.pizza.factory.ny

import factory.pizza.Pizza

data object NYStyleVeggiePizza : Pizza {
    override fun prepare() {
        println("Preparing NY style veggie pizza")
    }

    override fun bake() {
        println("Baking NY style veggie pizza")
    }

    override fun cut() {
        println("Cutting NY style veggie pizza")
    }

    override fun box() {
        println("Boxing NY style veggie pizza")
    }
}