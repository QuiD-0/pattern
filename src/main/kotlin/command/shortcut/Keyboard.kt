package command.shortcut

import command.shortcut.executor.ShortcutExecutor

class Keyboard(
    private val history: ShortCutHistory,
    private val command: (shortCut: KnownShortCut) -> ShortcutExecutor
) {
    fun pressShortCut(shortCut: KnownShortCut) {
        if (shortCut == KnownShortCut.CMD_Z) {
            val last = history.getLast()
            command(last).execute()
        } else {
            command(shortCut).execute()
            history.add(shortCut)
        }
    }
}