package decorator.beverage

data class Mocha(private val beverage: Beverage) : Beverage {
    override fun cost(): Double = beverage.cost() + 0.20
    override fun description(): String = "${beverage.description()}, Mocha"
}

data class Whip(private val beverage: Beverage) : Beverage {
    override fun cost(): Double = beverage.cost() + 0.10
    override fun description(): String = "${beverage.description()}, Whip"
}

data class Soy(private val beverage: Beverage) : Beverage {
    override fun cost(): Double = beverage.cost() + 0.15
    override fun description(): String = "${beverage.description()}, Soy"
}

data class SteamedMilk(private val beverage: Beverage) : Beverage {
    override fun cost(): Double = beverage.cost() + 0.10
    override fun description(): String = "${beverage.description()}, Steamed Milk"
}

class Caramel(private val beverage: Beverage) : Beverage {
    override fun cost(): Double = beverage.cost() + 0.15
    override fun description(): String = "${beverage.description()}, Caramel"
}