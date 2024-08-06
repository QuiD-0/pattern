package flyweight

class ImageFactory {
    private val images = mutableListOf<Image>()

    fun find(image: Image) = images.find { it == image }
        ?: image.also { images.add(it) }
}
