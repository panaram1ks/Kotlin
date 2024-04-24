fun main(args: Array<String>) {
    val myBox = Box<String>()
    myBox.display("T = String")

    val myBoxInt = Box<Int>()
    myBoxInt.display(100)
}

class Box<T> {

    fun display(item: T) {
        println(item)
    }

}