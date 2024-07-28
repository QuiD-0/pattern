package composite

data class Menu(
    val name: String,
    val description: String,
    val ingredientsComponents: MutableList<Component> = mutableListOf()
) : Component {

    override fun operation() {
        println("$name, $description")
        ingredientsComponents.forEach { it.operation() }
    }

    override fun add(component: Component) {
        ingredientsComponents.add(component)
    }

    override fun remove(component: Component) {
        ingredientsComponents.remove(component)
    }

    override fun price(): Double = ingredientsComponents.sumOf { it.price() }
}

