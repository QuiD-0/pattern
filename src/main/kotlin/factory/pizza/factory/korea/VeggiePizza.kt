package factory.pizza.factory.korea

import factory.pizza.Pizza

data object VeggiePizza : Pizza {
    override fun prepare() {
        println("Preparing veggie pizza")
    }

    override fun bake() {
        println("Baking veggie pizza")
    }

    override fun cut() {
        println("Cutting veggie pizza")
    }

    override fun box() {
        println("Boxing veggie pizza")
    }
}