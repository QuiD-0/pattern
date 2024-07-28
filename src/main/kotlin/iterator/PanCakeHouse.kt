package iterator

data class PanCakeHouse(
    val menuItems: MutableList<MenuItem> = mutableListOf()
): Iterator<MenuItem> {
    init {
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99)
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99)
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49)
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59)
    }

    private var position = 0

    private fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        menuItems.add(MenuItem(name, description, vegetarian, price))
    }

    override fun hasNext(): Boolean = position < menuItems.size

    override fun next(): MenuItem = menuItems[position++]
}
