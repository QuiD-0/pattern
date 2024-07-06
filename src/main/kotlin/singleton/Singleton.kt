package singleton


class Singleton private constructor() {

    private var name = "Singleton"

    fun updateName(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return "Singleton(name=$name)"
    }

    companion object {
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            if (instance == null) {
                instance = Singleton()
            }
            return instance!!
        }
    }
}

fun main() {
    val singleton = Singleton.getInstance()
    val anotherSingleton = Singleton.getInstance()
    require(singleton === anotherSingleton) { "Singletons are not the same" }

    singleton.updateName("Another Singleton")
    println(singleton)
    println(anotherSingleton)
}