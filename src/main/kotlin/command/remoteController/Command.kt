package command.remoteController

interface Command {
    fun execute()
    fun undo()
}

