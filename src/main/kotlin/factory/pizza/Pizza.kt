package factory.pizza

sealed interface Pizza {
    fun prepare()
    fun bake()
    fun cut()
    fun box()
}

data object CheesePizza : Pizza {
    override fun prepare() {
        println("Preparing cheese pizza")
    }

    override fun bake() {
        println("Baking cheese pizza")
    }

    override fun cut() {
        println("Cutting cheese pizza")
    }

    override fun box() {
        println("Boxing cheese pizza")
    }
}

data object PepperoniPizza : Pizza {
    override fun prepare() {
        println("Preparing pepperoni pizza")
    }

    override fun bake() {
        println("Baking pepperoni pizza")
    }

    override fun cut() {
        println("Cutting pepperoni pizza")
    }

    override fun box() {
        println("Boxing pepperoni pizza")
    }
}

data object ClamPizza : Pizza {
    override fun prepare() {
        println("Preparing clam pizza")
    }

    override fun bake() {
        println("Baking clam pizza")
    }

    override fun cut() {
        println("Cutting clam pizza")
    }

    override fun box() {
        println("Boxing clam pizza")
    }
}

data object VeggiePizza : Pizza {
    override fun prepare() {
        println("Preparing veggie pizza")
    }

    override fun bake() {
        println("Baking veggie pizza")
    }

    override fun cut() {
        println("Cutting veggie pizza")
    }

    override fun box() {
        println("Boxing veggie pizza")
    }
}

data object NYStyleCheesePizza : Pizza {
    override fun prepare() {
        println("Preparing NY style cheese pizza")
    }

    override fun bake() {
        println("Baking NY style cheese pizza")
    }

    override fun cut() {
        println("Cutting NY style cheese pizza")
    }

    override fun box() {
        println("Boxing NY style cheese pizza")
    }
}

data object NYStylePepperoniPizza : Pizza {
    override fun prepare() {
        println("Preparing NY style pepperoni pizza")
    }

    override fun bake() {
        println("Baking NY style pepperoni pizza")
    }

    override fun cut() {
        println("Cutting NY style pepperoni pizza")
    }

    override fun box() {
        println("Boxing NY style pepperoni pizza")
    }
}

data object NYStyleClamPizza : Pizza {
    override fun prepare() {
        println("Preparing NY style clam pizza")
    }

    override fun bake() {
        println("Baking NY style clam pizza")
    }

    override fun cut() {
        println("Cutting NY style clam pizza")
    }

    override fun box() {
        println("Boxing NY style clam pizza")
    }
}

data object NYStyleVeggiePizza : Pizza {
    override fun prepare() {
        println("Preparing NY style veggie pizza")
    }

    override fun bake() {
        println("Baking NY style veggie pizza")
    }

    override fun cut() {
        println("Cutting NY style veggie pizza")
    }

    override fun box() {
        println("Boxing NY style veggie pizza")
    }
}