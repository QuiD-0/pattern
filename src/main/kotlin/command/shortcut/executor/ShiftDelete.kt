package command.shortcut.executor

import command.shortcut.KnownShortCut.SHIFT_DELETE
import command.shortcut.ShortCutHistory

class ShiftDelete(
    private val history: ShortCutHistory
) : ShortcutExecutor {
    override fun execute() {
        println("Shift + Delete")
        history.add(SHIFT_DELETE)
    }
}