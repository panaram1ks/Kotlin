fun main(args: Array<String>) {
    for (i in 1..3) {
        seyHello()
        double(10)
    }
}

fun seyHello() {
    println("Hello everyone")
}

fun double(number: Int) {
    println("Double $number is ${number * 2}")
}