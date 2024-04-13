fun main(args: Array<String>){
    val hasEggs = true
    val hasBacon = true

    val eggsCost = 5
    val baconPack = 20

    var sum = 0
    if(hasEggs){
       println("I buy eggs")
        sum = 12 * eggsCost
        if(hasBacon){
            println(" and but bacon")
            sum += 5 * baconPack
        }
    }
    println("Total sum: ${sum}")
}