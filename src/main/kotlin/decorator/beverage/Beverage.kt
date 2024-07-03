package decorator.beverage

interface Beverage {
    fun cost(): Double
    fun description(): String
}

class Espresso : Beverage {
    override fun cost(): Double = 1.99
    override fun description(): String = "Espresso"
}

class HouseBlend : Beverage {
    override fun cost(): Double = 0.89
    override fun description(): String = "House Blend Coffee"
}

class DarkRoast : Beverage {
    override fun cost(): Double = 0.99
    override fun description(): String = "Dark Roast Coffee"
}

class Decaf : Beverage {
    override fun cost(): Double = 1.05
    override fun description(): String = "Decaf Coffee"
}