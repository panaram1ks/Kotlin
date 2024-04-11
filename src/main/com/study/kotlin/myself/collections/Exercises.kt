fun main(args: Array<String>){
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")
    items.removeAll(removedItems)
    println(items)

    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    animals.add("panda")
    
}
