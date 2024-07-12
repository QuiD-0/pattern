package command.shortcut.executor

import command.shortcut.KnownShortCut.CMD_V
import command.shortcut.ShortCutHistory

class CmdV(
    private val history: ShortCutHistory
) : ShortcutExecutor {
    override fun execute() {
        println("Cmd + V")
        history.add(CMD_V)
    }
}