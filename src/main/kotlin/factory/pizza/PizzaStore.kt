package factory.pizza

data class PizzaStore(private val factory: PizzaFactory) {
    fun orderPizza(type: Type): Pizza {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
