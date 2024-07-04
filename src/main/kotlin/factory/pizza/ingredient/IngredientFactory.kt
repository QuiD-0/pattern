package factory.pizza.ingredient

import factory.pizza.ingredient.korea.*
import factory.pizza.ingredient.ny.*

interface IngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clam
}

data object KoreaIngredientFactory : IngredientFactory {
    override fun createDough(): Dough = KoreaDough
    override fun createSauce(): Sauce = KoreaSauce
    override fun createCheese(): Cheese = KoreaCheese
    override fun createVeggies(): List<Veggies> = listOf(KoreaVeggies)
    override fun createPepperoni(): Pepperoni = KoreaPepperoni
    override fun createClam(): Clam = KoreaClam
}

data object NYIngredientFactory : IngredientFactory {
    override fun createDough(): Dough = NyDough
    override fun createSauce(): Sauce = NySauce
    override fun createCheese(): Cheese = NyCheese
    override fun createVeggies(): List<Veggies> = listOf(NyVeggies)
    override fun createPepperoni(): Pepperoni = NyPepperoni
    override fun createClam(): Clam = NyClam
}