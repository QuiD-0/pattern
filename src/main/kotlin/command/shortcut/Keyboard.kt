package command.shortcut

import command.shortcut.KnownShortCut.*
import command.shortcut.executor.ShortcutExecutor

class Keyboard(
    private val history: ShortCutHistory,
    private val command: (shortCut: KnownShortCut) -> ShortcutExecutor
) {
    fun pressShortCut(shortCut: KnownShortCut) {
        if (shortCut == CMD_Z) {
            val last = history.getLast() ?: return
            command(last).execute()
        } else {
            command(shortCut).execute()
            history.add(shortCut)
        }
    }
}