package strategy.order.discountPolicy

interface DiscountPolicy {
    fun applyDiscount(price: Double): Double
}