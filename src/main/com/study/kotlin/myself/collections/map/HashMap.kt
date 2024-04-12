fun main(args: Array<String>){
    val count = hashMapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println(count)
    count.put(4, "Four")
    println(count)

    var count2 = hashMapOf(Pair(20, "Twenty"), Pair(30, "Thirty"))
    count.putAll(count2)
    println(count)

    count.remove(20)
    println(count)

    count.clear()
    println(count)
}