package factory.pizza

import factory.pizza.ingredient.IngredientFactory

interface Pizza {
    val ingredientFactory: IngredientFactory
    fun prepare()
    fun bake()
    fun cut()
    fun box()
}

