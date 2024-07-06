package factory.pizza.factory.korea

import factory.pizza.Pizza
import factory.pizza.ingredient.IngredientFactory

data class VeggiePizza(override val ingredientFactory: IngredientFactory) : Pizza {
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