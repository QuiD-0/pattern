package factory.pizza.factory.ny

import factory.pizza.Pizza
import factory.pizza.ingredient.IngredientFactory

data class NYStyleCheesePizza(override val ingredientFactory: IngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing NY style cheese pizza")
    }

    override fun bake() {
        println("Baking NY style cheese pizza")
    }

    override fun cut() {
        println("Cutting NY style cheese pizza")
    }

    override fun box() {
        println("Boxing NY style cheese pizza")
    }
}