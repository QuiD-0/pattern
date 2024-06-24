package strategy.order

import strategy.order.discountPolicy.DiscountPolicy
import strategy.order.discountPolicy.NoDiscount
import strategy.order.shippingPolicy.*

data class DomesticOrder(
    override val originPrice: Double,
    override var discountPolicy: DiscountPolicy = NoDiscount(),
    override var shippingPolicy: ShippingPolicy = BikeShipping
): Order {
    override var totalPrice: Double = discountPolicy.applyDiscount(originPrice)
}