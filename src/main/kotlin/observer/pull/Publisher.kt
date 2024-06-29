package observer.pull


interface Publisher {
    fun subscribe(observer: Listener)
    fun unSubscribe(observer: Listener)
    fun alert()
}

class Rate : Publisher {
    private val listeners = mutableListOf<Listener>()
    var jpy = 0.0f
    var usd = 0.0f
    var eur = 0.0f


    override fun subscribe(observer: Listener) {
        listeners.add(observer)
    }

    override fun unSubscribe(observer: Listener) {
        listeners.remove(observer)
    }

    override fun alert() {
        listeners.forEach { it.update() }
    }

    fun updateData(jpy: Float, usd: Float, eur: Float) {
        this.jpy = jpy
        this.usd = usd
        this.eur = eur
        alert()
    }
}