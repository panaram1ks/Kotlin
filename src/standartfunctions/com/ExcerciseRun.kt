fun main(args: Array<String>) {

    var laptop = Laptop().run {
        println(isActive)
        protocolSwith()
        println("Check complited!")
    }

}

class Laptop {
    var isActive = true
    fun protocolSwith() {
        if (isActive) {
            isActive = false
            println(isActive)
        } else {
            isActive = true
            println(isActive)
        }
    }
}