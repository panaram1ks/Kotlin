fun main(args: Array<String>) {
    val list = arrayListOf("Bob", "Dan", "Carol")
    list.printSize()
}

fun ArrayList<String>.printSize() = println("This list contains ${this.size} elements")