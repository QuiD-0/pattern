package strategy.order

import strategy.order.discountPolicy.DiscountPolicy
import strategy.order.shippingPolicy.ShippingPolicy

sealed interface Order {
    fun updateDiscountPolicy(policy: DiscountPolicy): Order
    fun updateShippingType(policy: ShippingPolicy): Order
}