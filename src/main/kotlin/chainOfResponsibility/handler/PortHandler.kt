package chainOfResponsibility.handler

class PortHandler : Pipe<String> {
    override fun execute(input: String): String {
        println("PortHandler: $input")
        return input
    }
}