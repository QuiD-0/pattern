package factory.pizza.factory

import factory.pizza.Pizza
import factory.pizza.Type
import factory.pizza.Type.*
import factory.pizza.factory.korea.CheesePizza
import factory.pizza.factory.korea.ClamPizza
import factory.pizza.factory.korea.PepperoniPizza
import factory.pizza.factory.korea.VeggiePizza
import factory.pizza.factory.ny.NYStyleCheesePizza
import factory.pizza.factory.ny.NYStyleClamPizza
import factory.pizza.factory.ny.NYStylePepperoniPizza
import factory.pizza.factory.ny.NYStyleVeggiePizza
import factory.pizza.ingredient.KoreaIngredientFactory
import factory.pizza.ingredient.NYIngredientFactory

sealed interface PizzaFactory {
    fun createPizza(type: Type): Pizza
}

data object KoreaFactory : PizzaFactory {
    val ingredientFactory = KoreaIngredientFactory

    override fun createPizza(type: Type): Pizza =
        when (type) {
            CHEESE -> CheesePizza(ingredientFactory)
            PEPPERONI -> PepperoniPizza(ingredientFactory)
            CLAM -> ClamPizza(ingredientFactory)
            VEGGIE -> VeggiePizza(ingredientFactory)
        }
}

data object NYPizzaFactory : PizzaFactory {
    val ingredientFactory = NYIngredientFactory

    override fun createPizza(type: Type): Pizza =
        when (type) {
            CHEESE -> NYStyleCheesePizza(ingredientFactory)
            PEPPERONI -> NYStylePepperoniPizza(ingredientFactory)
            CLAM -> NYStyleClamPizza(ingredientFactory)
            VEGGIE -> NYStyleVeggiePizza(ingredientFactory)
        }

}