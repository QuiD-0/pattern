package strategy.order.shippingPolicy

data object AirplaneShipping : ShippingPolicy {
    override fun display() {
        println("Airplane shipping")
    }
}