fun main(args: Array<String>) {
    var onlyEvenNumbers = arrayListOf(2, 4, 6, 7, 8, 10)
    for (number in onlyEvenNumbers) {
        if (number % 2 != 0) {
            break
        }
        println("Half of $number is ${number / 2}")
    }
    println("Another example Continue")

    for (number in onlyEvenNumbers) {
        if (number % 2 != 0) {
            continue
        }
        println("Half of $number is ${number / 2}")
    }
}