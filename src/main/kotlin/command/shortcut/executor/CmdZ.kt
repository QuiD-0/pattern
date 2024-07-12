package command.shortcut.executor

import command.shortcut.ShortCutHistory

class CmdZ(private val history: ShortCutHistory): ShortcutExecutor {
    override fun execute() {
        println("Undo: ${history.getLast()}")
    }
}