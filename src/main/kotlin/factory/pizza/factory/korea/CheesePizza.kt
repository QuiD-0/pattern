package factory.pizza.factory.korea

import factory.pizza.Pizza
import factory.pizza.ingredient.IngredientFactory

data class CheesePizza(
    override val ingredientFactory: IngredientFactory
) : Pizza {

    override fun prepare() {
        println("Preparing pizza")
        println("Adding ${ingredientFactory.createDough()}")
        println("Adding ${ingredientFactory.createSauce()}")
        println("Adding ${ingredientFactory.createCheese()}")
    }

    override fun bake() {
        println("Baking  pizza")
    }

    override fun cut() {
        println("Cutting cheese pizza")
    }

    override fun box() {
        println("Boxing cheese pizza")
    }
}