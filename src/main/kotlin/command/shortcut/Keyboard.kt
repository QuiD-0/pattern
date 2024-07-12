package command.shortcut

import command.shortcut.executor.ShortcutExecutor

class Keyboard (
    private val command : (shortCut: KnownShortCut) -> ShortcutExecutor
) {
    fun pressShortCut(shortCut: KnownShortCut) {
        command(shortCut).execute()
    }
}