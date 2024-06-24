package strategy.order

import strategy.order.discountPolicy.DiscountPolicy
import strategy.order.discountPolicy.NoDiscount

data class Order(
    val originPrice: Double,
) {
    private var discountPolicy : DiscountPolicy = NoDiscount()
    var totalPrice: Double = originPrice

    fun updateDiscountPolicy(policy: DiscountPolicy) {
        this.discountPolicy = policy
        totalPrice = policy.applyDiscount(originPrice)
    }
}