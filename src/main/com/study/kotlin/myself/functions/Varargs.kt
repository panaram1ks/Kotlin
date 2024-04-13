fun main(args: Array<String>) {
    sayHelloByName("John", "Bill", "Roy")
    println(sumOfIntegers(4, 8, 10, 39, 43))
}

fun sayHelloByName(vararg names: String) {
    for (name in names) {
        println("Hello $name")
    }
}

fun sumOfIntegers(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}