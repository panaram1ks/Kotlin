fun main(args: Array<String>) {
    val math = Math()
    println(math.add(3, 7))
    println(math.mul(7, 5))
    println(math.sub(20, 17))
    println(math.div(30, 9))
}

class Math {

    fun add(v1: Int, v2: Int) = v1 + v2

    fun sub(v1: Int, v2: Int) = v1 - v2

    fun mul(v1: Int, v2: Int) = v1 * v2

    fun div(v1: Int, v2: Int) = v1.toDouble() / v2

}