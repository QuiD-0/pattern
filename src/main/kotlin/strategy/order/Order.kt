package strategy.order

import strategy.order.discountPolicy.DiscountPolicy
import strategy.order.shippingPolicy.ShippingPolicy

sealed interface Order {
    val originPrice: Double
    var totalPrice: Double
    var discountPolicy: DiscountPolicy
    var shippingPolicy: ShippingPolicy

    fun updateDiscountPolicy(policy: DiscountPolicy) {
        this.discountPolicy = policy
        totalPrice = policy.applyDiscount(originPrice)
    }

    fun updateShippingType(policy: ShippingPolicy) {
        this.shippingPolicy = policy
    }
}