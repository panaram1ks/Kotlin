fun main(args: Array<String>) {
    val name = "Michael"
    println(name.slim())
}

fun String.slim() = this.substring(1, length - 1)

//fun String.slim(): String {
//    return this.substring(1, length - 1)
//}