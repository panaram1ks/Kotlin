fun main(args: Array<String>) {
    println("SomeString".getCustomName())
    println(1000.getCustomName())
    println(1f.getCustomName())
}

fun String.getCustomName() = "A string of characters"

fun Int.getCustomName() = "An integer number"

fun Float.getCustomName() = "Floating point number"