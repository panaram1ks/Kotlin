fun main(args: Array<String>) {
    val number = setOf(3, 4, null, 83, 56)
    println(number.size)

    println(number.contains(4))
    println(number.contains(5))

    val newNumbers = setOf(4,3)
    println(number.containsAll(newNumbers))
}