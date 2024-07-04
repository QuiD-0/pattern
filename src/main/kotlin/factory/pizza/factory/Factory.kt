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

sealed interface PizzaFactory {
    fun createPizza(type: Type): Pizza
}

data object KoreaFactory : PizzaFactory {
    override fun createPizza(type: Type): Pizza =
        when (type) {
            CHEESE -> CheesePizza
            PEPPERONI -> PepperoniPizza
            CLAM -> ClamPizza
            VEGGIE -> VeggiePizza
        }
}

data object NYPizzaFactory : PizzaFactory {
    override fun createPizza(type: Type): Pizza =
        when (type) {
            CHEESE -> NYStyleCheesePizza
            PEPPERONI -> NYStylePepperoniPizza
            CLAM -> NYStyleClamPizza
            VEGGIE -> NYStyleVeggiePizza
        }

}