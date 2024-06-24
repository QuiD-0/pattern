package strategy.order.discountPolicy

class NoDiscount : DiscountPolicy {
    override fun applyDiscount(price: Double): Double = price
}
