package observer.pull

interface Listener {
    fun update()
}

class RateDisplay(
    private val rate: Rate
) : Listener {

    override fun update() {
        display()
    }

    private fun display() {
        println("Current rates: JPY ${rate.jpy}, USD ${rate.usd}, EUR ${rate.eur}")
    }
}

class JpyDisplay(
    private val rate: Rate
) : Listener {

    override fun update() {
        display()
    }

    private fun display() {
        println("JPY rate: ${rate.jpy}")
    }
}

