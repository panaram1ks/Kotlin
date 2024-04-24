fun main(args: Array<String>) {
    val shape1 = Square()
    val circle1 = Circle()
    val geometry = Geometry<Square>()
    geometry.printArea(shape1, 10)

    val geometry2 = Geometry<Circle>()
    geometry2.printArea(circle1, 10)
}

abstract class Shape {
    abstract fun area(size: Int): Double
}

class Square : Shape() {
    override fun area(size: Int): Double {
        return (size * size).toDouble()
    }
}

class Circle : Shape() {
    override fun area(size: Int): Double {
        return size * size * 3.1415
    }
}

class Geometry<T : Shape> {
    fun printArea(item: T, size: Int) {
        println(item.area(size))
    }
}