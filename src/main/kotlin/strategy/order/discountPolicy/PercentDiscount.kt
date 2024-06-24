package strategy.order.discountPolicy

data class PercentDiscount(
    val discountRate: Int
) : DiscountPolicy {

    init {
        require(discountRate in 1..100) { "Discount rate must be between 1 and 100" }
    }

    override fun applyDiscount(price: Double): Double = price * (1 - discountRate / 100.0)
}