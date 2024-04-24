fun main(args: Array<String>) {
    val color = Colors.RED
    println(color.timesUsed)
    println(color.ordinal)
    println(color.name)

    when (color) {
        Colors.RED -> println("You chose red")
        Colors.GREEN -> println("You chose green")
        Colors.BLUE -> println("You chose blue")
    }
}

enum class Colors(val timesUsed: Int) {
    RED(34),
    GREEN(12),
    BLUE(64)
}