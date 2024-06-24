package strategy.order

import strategy.order.discountPolicy.DiscountPolicy
import strategy.order.discountPolicy.NoDiscount
import strategy.order.shippingPolicy.ShipShipping
import strategy.order.shippingPolicy.ShippingPolicy

data class OverseasOrder(
    override val originPrice: Double,
    override var discountPolicy: DiscountPolicy = NoDiscount(),
    override var shippingPolicy: ShippingPolicy = ShipShipping
) : Order {
    override var totalPrice: Double = discountPolicy.applyDiscount(originPrice)
}
