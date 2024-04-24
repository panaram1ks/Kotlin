fun main(args: Array<String>) {
    val fruit10 = Apple10()
    val chef = Chef<Fruit10>()
    chef.cook(fruit10)
}

abstract class Fruit10 {
    abstract fun peel()
}

class Apple10 : Fruit10() {
    override fun peel() {
        println("Peeling the apple")
    }
}

class Chef<T : Fruit10> {
    fun cook(item: T) {
        item.peel()
    }
}