package flyweight

fun main() {
    val imageFactory = ImageFactory()
    val image1 = imageFactory.find(Image("image1", "path1"))
    val image2 = imageFactory.find(Image("image2", "path2"))
    val image3 = imageFactory.find(Image("image1", "path1"))

    println(image1)
    println(image2)
    println(image3)

    println(image1 === image3)

}