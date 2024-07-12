package command.shortcut.executor

import command.shortcut.KnownShortCut.CMD_C
import command.shortcut.ShortCutHistory

class CmdC(
    private val history: ShortCutHistory
) : ShortcutExecutor {
    override fun execute() {
        println("Cmd + C")
        history.add(CMD_C)
    }
}

