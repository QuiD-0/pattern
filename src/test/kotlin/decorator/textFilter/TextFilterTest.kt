package decorator.textFilter

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TextFilterTest {

    @Test
    fun test() {
        val text = "Hello, World!"

        val lowerCaseFilter = LowerCaseFilter(BaseText(text))
        assertEquals("hello, world!", lowerCaseFilter.apply(text))

        val upperCaseFilter = UpperCaseFilter(lowerCaseFilter)
        assertEquals("HELLO, WORLD!", upperCaseFilter.apply(text))

        val reverseFilter = ReverseFilter(upperCaseFilter)
        assertEquals("!DLROW ,OLLEH", reverseFilter.apply(text))
    }
}