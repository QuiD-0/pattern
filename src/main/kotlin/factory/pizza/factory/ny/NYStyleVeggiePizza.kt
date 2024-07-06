package factory.pizza.factory.ny

import factory.pizza.Pizza
import factory.pizza.ingredient.IngredientFactory

data class NYStyleVeggiePizza(override val ingredientFactory: IngredientFactory) : Pizza {
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