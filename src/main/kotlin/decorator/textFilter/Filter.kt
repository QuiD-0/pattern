package decorator.textFilter

interface Filter {
    fun apply(text: String): String
}

data class BaseText(private val text: String): Filter {
    override fun apply(text: String): String = text
}

data class LowerCaseFilter(private val filter: Filter) : Filter {
    override fun apply(text: String): String = filter.apply(text).lowercase()
}

data class UpperCaseFilter(private val filter: Filter) : Filter {
    override fun apply(text: String): String = filter.apply(text).uppercase()
}

data class ReverseFilter(private val filter: Filter) : Filter {
    override fun apply(text: String): String = filter.apply(text).reversed()
}
