fun main(args: Array<String>) {
    BookMy.printMe()

    Double.printClassName()
}

class BookMy {
    companion object {

    }
}

fun BookMy.Companion.printMe() {
    println("Book has been printed")
}

fun Double.Companion.printClassName() = println(this.javaClass)