package factory.pizza

fun main() {
    val nyStore = NYPizzaStore()
    nyStore.orderPizza(Type.CHEESE)

    val simpleStore = KoreaPizzaStore()
    simpleStore.orderPizza(Type.PEPPERONI)
}
