package composite

interface Component {
    fun operation()

    fun add(component: Component)

    fun remove(component: Component)

    fun price(): Double
}