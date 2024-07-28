package composite

fun main() {

    val restaurant = Restaurant(
        "Restaurant", "Main restaurant"
    )

    val menu = Menu(
        "Menu", "Main menu"
    )

    val ingredient1 = Ingredient(
        "Ingredient 1", "Ingredient 1 description", true, 1.0
    )

    val ingredient2 = Ingredient(
        "Ingredient 2", "Ingredient 2 description", false, 2.0
    )

    val ingredient3 = Ingredient(
        "Ingredient 3", "Ingredient 3 description", true, 3.0
    )

    menu.add(ingredient1)
    menu.add(ingredient2)
    menu.add(ingredient3)

    restaurant.add(menu)

    restaurant.operation()

    println("Total price: ${restaurant.price()}")
}
