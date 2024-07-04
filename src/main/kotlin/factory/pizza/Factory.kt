package factory.pizza

import factory.pizza.Type.*

interface PizzaFactory {
    fun createPizza(type: Type): Pizza
}

object SimpleFactory : PizzaFactory {
    override fun createPizza(type: Type): Pizza =
        when (type) {
            CHEESE -> CheesePizza
            PEPPERONI -> PepperoniPizza
            CLAM -> ClamPizza
            VEGGIE -> VeggiePizza
        }
}

object NYPizzaFactory : PizzaFactory {
    override fun createPizza(type: Type): Pizza =
        when (type) {
            CHEESE -> NYStyleCheesePizza
            PEPPERONI -> NYStylePepperoniPizza
            CLAM -> NYStyleClamPizza
            VEGGIE -> NYStyleVeggiePizza
        }

}