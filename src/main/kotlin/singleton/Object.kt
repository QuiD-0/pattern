package singleton

data object Object {
    private var name = "Object"
    private val age by lazy { 10 }

    fun updateName(name: String) {
         this.name = name
    }
    override fun toString(): String {
        return "Object(name=$name, age=$age)"
    }
}

fun main() {
    val objects = Object
    println(objects)
    val anotherObject = Object
    println(anotherObject)

    objects.updateName("Another Object")
    println(objects)
    println(anotherObject)
}