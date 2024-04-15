fun main(args: Array<String>) {
    val jetPack = Jetpack()
    jetPack.burn(10)
    println("User height is ${jetPack.userHeight}")
    for (i in 1..10) {
        jetPack.stop(1)
        println("User height is ${jetPack.userHeight}")
    }
}

class Jetpack {

    var userHeight = 0

    fun burn(seconds: Int) {
        userHeight += seconds
    }

    fun stop(seconds: Int) {
        userHeight -= 3 * seconds
        if (userHeight < 0) userHeight = 0
    }

}