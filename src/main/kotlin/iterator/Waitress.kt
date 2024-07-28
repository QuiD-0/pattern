package iterator

data class Waitress(
    val pancakeHouseMenu: PanCakeHouse,
    val dinerMenu: DinerMenu
) {
    fun printMenu() {
        while (pancakeHouseMenu.hasNext()) {
            val menuItem = pancakeHouseMenu.next()
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
        while (dinerMenu.hasNext()) {
            val menuItem = dinerMenu.next()
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
    }
}