package proxy.rmi

object Server {
    @JvmStatic
    fun main(args: Array<String>) {
        publish<HelloService>(4000, HelloServiceImpl())
        println("Server started")
    }
}

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val helloService = consume<HelloService>("localhost", 4000)
        println(helloService.hello(Person("Bob", 20)))
    }
}