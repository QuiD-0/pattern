package command.shortcut

import java.util.concurrent.ConcurrentLinkedDeque

class ShortCutHistory(private val size: Int = 10) {
    private val history = ConcurrentLinkedDeque<KnownShortCut>()

    fun add(shortCut: KnownShortCut) {
        if (history.size >= size) {
            history.poll()
        }
        history.add(shortCut)
    }

    fun getLast(): KnownShortCut? = history.pollLast()

}
