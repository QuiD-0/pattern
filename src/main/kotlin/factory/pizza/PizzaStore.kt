package factory.pizza

import factory.pizza.factory.KoreaFactory
import factory.pizza.factory.NYPizzaFactory

interface PizzaStore {
    fun orderPizza(type: Type): Pizza
}

class KoreaPizzaStore : PizzaStore {
    private val factory = KoreaFactory

    override fun orderPizza(type: Type): Pizza {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}

class NYPizzaStore : PizzaStore {
    private val factory = NYPizzaFactory

    override fun orderPizza(type: Type): Pizza {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
