fun main(args: Array<String>) {
    run {
        var re = Restaurant4()
        re.standardDish = "standard2024"
        re.todaySpecial = "special2024"
        println(re)
        println(re.printMenu())
    }
}

class Restaurant4 {
    var standardDish = ""
    var todaySpecial = ""
    fun printMenu() {
        println("The standard dish is $standardDish")
        println("Today's special is $todaySpecial")
    }
}