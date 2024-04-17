fun main(args: Array<String>) {

}

open class Airplane {
    internal val type = "Airbus"

    internal fun fly() {
        println("flying")
    }
}

class MyAirplane : Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar() {
    fun start() {
        val airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}