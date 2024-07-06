package factory.pizza

fun main() {
    val nyStore = NYPizzaStore()
    nyStore.orderPizza(Type.CHEESE)

    val koreaStore = KoreaPizzaStore()
    koreaStore.orderPizza(Type.PEPPERONI)
}
