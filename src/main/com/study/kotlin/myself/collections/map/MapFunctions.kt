fun main(args: Array<String>) {
    val count = hashMapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println("This map has a size of ${count.size}")
    println("Does the map have the key 2? ${count.containsKey(2)}")
    println("Does the map have the key 5? ${count.containsKey(5)}")
    println("Does the map have the value \"One\"? ${count.containsValue("One")}")

    println("Does the map is empty? ${count.isEmpty()}")
    println("Does the map is not empty? ${count.isNotEmpty()}")

}