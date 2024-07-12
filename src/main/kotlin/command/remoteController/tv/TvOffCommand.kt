package command.remoteController.tv

import command.remoteController.Command

data class TvOffCommand(
    val tv: Tv
) : Command {
    override fun execute() {
        tv.on()
    }

    override fun undo() {
        tv.off()
    }
}