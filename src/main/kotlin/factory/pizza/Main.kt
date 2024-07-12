package factory.pizza

import factory.pizza.factory.KoreaFactory
import factory.pizza.factory.NYPizzaFactory

fun main() {
    val nyStore = PizzaStore(NYPizzaFactory)
    nyStore.orderPizza(Type.CHEESE)

    val koreaStore = PizzaStore(KoreaFactory)
    koreaStore.orderPizza(Type.PEPPERONI)
}
