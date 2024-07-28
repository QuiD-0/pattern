package composite

data class Ingredient(
    val name: String,
    val description: String,
    val vegetarian: Boolean,
    val price: Double
) : Component {

    override fun operation() {
        println("$name, $price -- $description")
    }

    override fun add(component: Component) {
        throw UnsupportedOperationException()
    }

    override fun remove(component: Component) {
        throw UnsupportedOperationException()
    }

    override fun price(): Double = price

}
