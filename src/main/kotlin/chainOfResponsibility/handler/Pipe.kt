package chainOfResponsibility.handler

interface Pipe<I> {

    fun execute(input: I): I

    fun addPipe(nextPipe: Pipe<I>): Pipe<I> {
        return object : Pipe<I> {
            override fun execute(input: I): I {
                return nextPipe.execute(this@Pipe.execute(input))
            }
        }
    }

    companion object {
        fun <I> of(pipe: Pipe<I>): Pipe<I> {
            return pipe
        }
    }
}


