fun main(args:Array<String>){
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)

    val people = 7500000000
    val fewPeople = people.toInt()
    println(people::class.java)
    println(fewPeople::class.java)
    println(fewPeople)


    val dogs = 5
    val byteDogs = dogs.toByte()
    println(byteDogs::class.java)

}