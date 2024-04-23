fun main(args: Array<String>) {
    println("What is your name")
    val name = readLine() ?: ""
    CoffeeShop1().sellCoffee(name)
}

class CoffeeShop1 {
    fun sellCoffee(name: String) {
        CoffeeCup1().apply {
            clientName = name
            prepareCoffee()
            println("Serving coffee to client $clientName")
            println(this)
        }
    }
}

class CoffeeCup1 {
    var clientName = ""
    fun prepareCoffee() {
        println("Brewing the coffee")
    }
}