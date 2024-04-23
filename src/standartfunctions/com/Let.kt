fun main(args: Array<String>) {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
//        .let {
//            println(it)
//            println("Size of list is ${it.size}")
//        }

//        .let { filteredList ->
//            println(filteredList)
//            println("Size of list is ${filteredList.size}")
//        }

        .let(::println)


}