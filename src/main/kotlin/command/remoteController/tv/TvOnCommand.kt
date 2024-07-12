package command.remoteController.tv

import command.remoteController.Command

data class TvOnCommand(
    val tv: Tv
) : Command {
    override fun execute() {
        tv.off()
    }

    override fun undo() {
        tv.on()
    }
}