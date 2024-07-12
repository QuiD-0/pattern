package command.remoteController

class Controller(
    private val commands: (type: Type) -> Command
) {
    private var undoCommand: Command? = null

    fun commandButtonPushed(type: Type) {
        commands(type).execute()
        undoCommand = commands(type)
    }

    fun undoButtonPushed() {
        undoCommand?.undo()
    }
}