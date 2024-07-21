package templateMethod

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

data class BeverageMaker(
    val beverage: CaffeineBeverage
) {
    fun makeBeverage() {
        beverage.boilWater()
        beverage.brew()
        beverage.pourInCup()
        checkCustomerWantsCondiments()
    }

    private fun checkCustomerWantsCondiments() {
        println("Checking customer wants condiments")
        BufferedReader(InputStreamReader(System.`in`)).readLine().let {
            if (it.lowercase(Locale.getDefault()).startsWith("y")) {
                beverage.addCondiments()
            }
        }
    }

}