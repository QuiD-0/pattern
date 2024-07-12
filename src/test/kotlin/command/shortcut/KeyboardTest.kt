package command.shortcut

import command.shortcut.KnownShortCut.*
import command.shortcut.executor.*
import org.junit.jupiter.api.Test

class KeyboardTest {

    @Test
    fun testPressShortCut() {
        val shortCutHistory = ShortCutHistory()

        val keyboard = Keyboard(shortCutHistory) {
            when (it) {
                CMD_C -> CmdC
                CMD_Z -> CmdZ
                CMD_V -> CmdV
                CMD_X -> CmdX
                SHIFT_INSERT -> ShiftInsert
                SHIFT_DELETE -> ShiftDelete
            }
        }

        listOf(CMD_C, CMD_V, CMD_X, CMD_Z, CMD_Z, CMD_Z, CMD_Z, SHIFT_INSERT, CMD_Z, SHIFT_DELETE)
            .forEach(keyboard::pressShortCut)
    }
}