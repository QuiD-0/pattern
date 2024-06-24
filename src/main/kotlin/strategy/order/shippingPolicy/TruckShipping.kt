package strategy.order.shippingPolicy

data object TruckShipping : ShippingPolicy {
    override fun display() {
        println("Truck shipping")
    }
}