package strategy.order

import strategy.order.discountPolicy.DiscountPolicy
import strategy.order.discountPolicy.NoDiscount
import strategy.order.shippingPolicy.BikeShipping
import strategy.order.shippingPolicy.ShippingPolicy

data class DomesticOrder(
    val originPrice: Double,
    val discountPolicy: DiscountPolicy = NoDiscount(),
    val shippingPolicy: ShippingPolicy = BikeShipping
) : Order {
    var totalPrice: Double = discountPolicy.applyDiscount(originPrice)

    override fun updateDiscountPolicy(policy: DiscountPolicy): DomesticOrder = copy(discountPolicy = policy)

    override fun updateShippingType(policy: ShippingPolicy): DomesticOrder = copy(shippingPolicy = policy)
}