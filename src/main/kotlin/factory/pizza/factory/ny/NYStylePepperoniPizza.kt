package factory.pizza.factory.ny

import factory.pizza.Pizza
import factory.pizza.ingredient.IngredientFactory

data class NYStylePepperoniPizza(override val ingredientFactory: IngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing NY style pepperoni pizza")
    }

    override fun bake() {
        println("Baking NY style pepperoni pizza")
    }

    override fun cut() {
        println("Cutting NY style pepperoni pizza")
    }

    override fun box() {
        println("Boxing NY style pepperoni pizza")
    }
}