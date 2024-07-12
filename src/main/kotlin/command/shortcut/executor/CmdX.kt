package command.shortcut.executor

import command.shortcut.KnownShortCut.CMD_X
import command.shortcut.ShortCutHistory

class CmdX(
    private val history: ShortCutHistory
) : ShortcutExecutor {
    override fun execute() {
        println("Cmd + X")
        history.add(CMD_X)
    }
}