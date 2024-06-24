package strategy.order.discountPolicy

data class FixAmountDiscount(
    private val discountAmount: Double
) : DiscountPolicy {

    init {
        require(discountAmount > 0) { "Amount must be greater than 0" }
    }

    override fun applyDiscount(price: Double): Double = if (price < discountAmount) 0.0 else price - discountAmount

}