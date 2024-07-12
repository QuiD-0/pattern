package command.shortcut

import command.shortcut.KnownShortCut.*
import command.shortcut.executor.*
import org.junit.jupiter.api.Test

class KeyboardTest {

    @Test
    fun testPressShortCut() {

        val shortCutHistory = ShortCutHistory()

        val keyboard = Keyboard {
            when (it) {
                CMD_C -> CmdC(shortCutHistory)
                CMD_Z -> CmdZ(shortCutHistory)
                CMD_V -> CmdV(shortCutHistory)
                CMD_X -> CmdX(shortCutHistory)
                SHIFT_INSERT -> ShiftInsert(shortCutHistory)
                SHIFT_DELETE -> ShiftDelete(shortCutHistory)
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