package factory.pizza

fun main() {
    val nyStore = PizzaStore(NYPizzaFactory)
    nyStore.orderPizza(Type.CHEESE)

    val simpleStore = PizzaStore(SimpleFactory)
    simpleStore.orderPizza(Type.PEPPERONI)
}
