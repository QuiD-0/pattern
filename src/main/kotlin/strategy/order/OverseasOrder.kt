package strategy.order

import strategy.order.discountPolicy.DiscountPolicy
import strategy.order.discountPolicy.NoDiscount
import strategy.order.shippingPolicy.ShipShipping
import strategy.order.shippingPolicy.ShippingPolicy

data class OverseasOrder(
    val originPrice: Double,
    val discountPolicy: DiscountPolicy = NoDiscount(),
    val shippingPolicy: ShippingPolicy = ShipShipping
) : Order {
    var totalPrice: Double = discountPolicy.applyDiscount(originPrice)

    override fun updateDiscountPolicy(policy: DiscountPolicy): OverseasOrder = copy(discountPolicy = policy)

    override fun updateShippingType(policy: ShippingPolicy): OverseasOrder = copy(shippingPolicy = policy)
}