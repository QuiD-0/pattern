package command.remoteController

import command.remoteController.light.BedRoomLight
import command.remoteController.light.LightOffCommand
import command.remoteController.light.LightOnCommand
import command.remoteController.tv.BedRoomTv
import command.remoteController.tv.TvOffCommand
import command.remoteController.tv.TvOnCommand
import org.junit.jupiter.api.Test

class ControllerTest {

    @Test
    fun test() {
        val light = BedRoomLight()
        val tv = BedRoomTv()

        val remoteController = Controller {
            when (it) {
                Type.LIGHT_ON -> LightOnCommand(light)
                Type.LIGHT_OFF -> LightOffCommand(light)
                Type.TV_ON -> TvOnCommand(tv)
                Type.TV_OFF -> TvOffCommand(tv)
            }
        }

        val commandList = listOf(
            Type.LIGHT_ON,
            Type.LIGHT_OFF,
            Type.TV_ON,
            Type.TV_OFF
        )

        commandList.forEach(remoteController::commandButtonPushed)

    }
}