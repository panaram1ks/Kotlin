fun main(args: Array<String>) {
    val numbers = hashSetOf(6, 37, null, 6, 42)
    val noNumberes = hashSetOf<Int>()
    println(numbers)
    println(noNumberes)

    numbers.add(44)
    println(numbers)

    val newNumbers = hashSetOf(11, 12, 13, null, 98)
    numbers.addAll(newNumbers)
    println(numbers)
    numbers.remove(98)
    println(numbers)

}