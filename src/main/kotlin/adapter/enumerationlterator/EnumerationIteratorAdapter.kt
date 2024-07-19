package adapter.enumerationlterator

import java.util.*

class EnumerationIteratorAdapter(
    private val enumeration: Enumeration<*>
) : Iterator<Any> {

    override fun hasNext(): Boolean {
        return enumeration.hasMoreElements()
    }

    override fun next(): Any {
        return enumeration.nextElement()
    }
}