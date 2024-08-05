package chainOfResponsibility

import chainOfResponsibility.handler.DomainHandler
import chainOfResponsibility.handler.HttpHandler
import chainOfResponsibility.handler.Pipe
import chainOfResponsibility.handler.PortHandler

fun main() {
    val httpHandler = HttpHandler()
    val domainHandler = DomainHandler()
    val portHandler = PortHandler()

    Pipe.of(httpHandler)
        .addPipe(domainHandler)
        .addPipe(portHandler)
        .execute("Request")

}
