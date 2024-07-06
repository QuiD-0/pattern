package factory.pizza.factory.korea

import factory.pizza.Pizza
import factory.pizza.ingredient.IngredientFactory

data class PepperoniPizza(override val ingredientFactory: IngredientFactory) : Pizza {

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