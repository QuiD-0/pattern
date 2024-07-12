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
        keyboard.pressShortCut(CMD_C)
        keyboard.pressShortCut(CMD_V)
        keyboard.pressShortCut(CMD_X)
        keyboard.pressShortCut(CMD_Z)
        keyboard.pressShortCut(SHIFT_INSERT)
        keyboard.pressShortCut(SHIFT_DELETE)
    }
}