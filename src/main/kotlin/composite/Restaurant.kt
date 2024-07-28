package composite

data class Restaurant(
    val name: String,
    val description: String,
    val menuComponents: MutableList<Component> = mutableListOf()
) : Component {

    override fun operation() {
        println("$name, $description")
        menuComponents.forEach { it.operation() }
    }

    override fun add(component: Component) {
        menuComponents.add(component)
    }

    override fun remove(component: Component) {
        menuComponents.remove(component)
    }

    override fun price(): Double = menuComponents.sumOf { it.price() }
}