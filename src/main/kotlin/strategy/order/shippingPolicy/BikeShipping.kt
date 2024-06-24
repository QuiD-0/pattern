package strategy.order.shippingPolicy

data object BikeShipping : ShippingPolicy {
    override fun display() {
        println("Default shipping")
    }
}