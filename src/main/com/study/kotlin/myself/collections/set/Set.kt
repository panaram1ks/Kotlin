fun main(args: Array<String>) {
    val numbers = setOf(6, 37, 6, 42)
    println(numbers)

    val number2 = setOf<Int>()
    println(number2)

    val number3 = setOf<Int?>(6, 2, 5, null, 8, 5, 7, null, 4, null)
    println(number3)
}