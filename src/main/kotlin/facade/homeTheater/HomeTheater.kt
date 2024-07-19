package facade.homeTheater

import facade.homeTheater.component.*

data class HomeTheater(
    val amplifier: Amplifier,
    val tuner: Tuner,
    val dvdPlayer: DvdPlayer,
    val cdPlayer: CdPlayer,
    val projector: Projector,
    val lights: TheaterLights,
    val screen: Screen,
    val popper: PopcornPopper
) {
    fun watchMovie(movie: String) {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amplifier.on()
        amplifier.setSurroundSound()
        amplifier.setVolume(5)
        dvdPlayer.on()
        dvdPlayer.play(movie)
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amplifier.off()
        dvdPlayer.stop()
        dvdPlayer.eject()
        dvdPlayer.off()
    }
}

