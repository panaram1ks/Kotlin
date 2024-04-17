fun main(args:Array<String>){
    val container: Container = Bottle()
    container.pour()
}

abstract class Container {
    fun pour() {
        println("pouring liquid")
    }
    abstract fun fill()
}


class Bottle : Container() {
//    fun pour(){
//        println("pouring liquid")
//    }
   override fun fill(){
        println("filling bottle")
    }
}

class Jug : Container() {
    //    fun pour(){
//        println("pouring liquid")
//    }
    override fun fill() {
        println("filling jug")
    }
}