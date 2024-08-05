package chainOfResponsibility.handler

class HttpHandler : Pipe<String> {
    override fun execute(input: String): String {
        println("HttpHandler: $input")
        return input
    }
}