fun main(args: Array<String>) {
    val numbers = hashSetOf(3, 4, null, 83, 56)
    val newNumbers = hashSetOf(4, 3, null, 99, 98, 97)

    println(numbers.intersect(newNumbers))
//    numbers.clear()
//    println(numbers)

    println(numbers.contains(83))

}