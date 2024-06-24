package strategy.order.shippingPolicy

data object ShipShipping: ShippingPolicy {
    override fun display() {
        println("Ship shipping")
    }
}