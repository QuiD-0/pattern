package iterator

data class MenuItem(
    val name: String,
    val description: String,
    val vegetarian: Boolean,
    val price: Double
) {
    override fun toString(): String = "$name, $price -- $description"

    fun isVegetarian(): Boolean = vegetarian

}