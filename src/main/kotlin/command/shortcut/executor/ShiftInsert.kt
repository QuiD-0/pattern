package command.shortcut.executor

import command.shortcut.KnownShortCut.SHIFT_INSERT
import command.shortcut.ShortCutHistory

class ShiftInsert(
    private val history: ShortCutHistory
) : ShortcutExecutor {
    override fun execute() {
        println("Shift + Insert")
        history.add(SHIFT_INSERT)
    }
}