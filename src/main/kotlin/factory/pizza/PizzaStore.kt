package factory.pizza

import factory.pizza.factory.KoreaFactory
import factory.pizza.factory.NYPizzaFactory
import factory.pizza.factory.PizzaFactory
import factory.pizza.ingredient.KoreaIngredientFactory
import factory.pizza.ingredient.NYIngredientFactory

interface PizzaStore {
    fun orderPizza(type: Type): Pizza
}

class KoreaPizzaStore {
    private val factory = KoreaFactory
    private val ingredientFactory = KoreaIngredientFactory

    fun orderPizza(type: Type): Pizza {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}

class NYPizzaStore {
    private val factory = NYPizzaFactory
    private val ingredientFactory = NYIngredientFactory

    fun orderPizza(type: Type): Pizza {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
