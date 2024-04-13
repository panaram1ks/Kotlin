fun main(args: Array<String>){
    val favouritePet = "dog"
    val availablePest = listOf("dog", "cat", "horse")
    if(favouritePet in availablePest){
        println("We have your next best friend")
    } else {
        println("Sorry, ${favouritePet} is not available")
    }

    val secondFavouritePet = "cat"
    if(secondFavouritePet !in availablePest){
        println("We have your next best friend")
    } else {
        println("Sorry, ${secondFavouritePet} is not available")
    }

    val number = 100
    if(number !in 0..90){
        println("Not in range")
    }

}