fun main(args: Array<String>){
    println("Michael".betterLenght)
}

//val String.betterLenght: Int
//    get(){
//        println("Getting the better length")
//        return 200
//    }

val String.betterLenght: Int
    get() = 200