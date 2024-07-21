package templateMethod

class Tea : CaffeineBeverage {

    override fun boilWater() {
        println("Boiling water")
    }

    override fun pourInCup() {
        println("Pouring into cup")
    }

    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }

}