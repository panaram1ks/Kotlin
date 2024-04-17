fun main(args: Array<String>) {
//    val myOven: Oven? = null

    val myOven: Oven = getOven()

    myOven?.turnOn()
    myOven?.cook(150)
    myOven?.turnOff()
}

fun getOven(): Oven {
    return Bosh()
}

interface Oven {

    val temperature: Int

    fun turnOn()
    fun turnOff()

    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }

}

class Bosh : Oven {

    override val temperature = 180

    override fun turnOn() {
        println("Turning on")
    }

    override fun turnOff() {
        println("Turning off")
    }

}