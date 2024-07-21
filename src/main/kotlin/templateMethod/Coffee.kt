package templateMethod

class Coffee : CaffeineBeverage {

    override fun boilWater() {
        println("Boiling water")
    }

    override fun pourInCup() {
        println("Pouring into cup")
    }

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }
}