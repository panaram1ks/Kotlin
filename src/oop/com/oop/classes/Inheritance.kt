fun main(args: Array<String>) {
    var corgi = Corgi()
    corgi.size = 10
    println(corgi.size)
    corgi.bark()
    corgi.play()
}

open class Dog {
    var size = 0
    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Corgi : Dog() {

}