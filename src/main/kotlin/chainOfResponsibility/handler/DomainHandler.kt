package chainOfResponsibility.handler

class DomainHandler : Pipe<String> {
    override fun execute(input: String): String {
        println("DomainHandler: $input")
        return input
    }
}