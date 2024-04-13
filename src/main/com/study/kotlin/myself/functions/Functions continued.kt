fun main(args: Array<String>) {
    println(multiply(3))
    println(multiply(3, 5))
}

fun multiply(number: Int) = number * 2

fun multiply(number: Int, multiplier: Int) = number * multiplier