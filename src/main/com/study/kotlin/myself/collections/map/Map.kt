fun main(args: Array<String>){
    val count = mapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println(count)
    println(count[2])

    var count2 = mapOf<Int, String>()
    println(count2)
}