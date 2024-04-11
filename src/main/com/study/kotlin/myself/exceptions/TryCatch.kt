fun main(args: Array<String>){
    val test = readLine()
    try{
        println(test?.toInt())
    } catch (e: Exception){
        println("An exception happened ${e.localizedMessage}")
    } finally {
        throw IllegalStateException("I don't like this input")
        println("The execution has completed")

    }
}