fun main(args: Array<String>) {
    val car = Car6()
//    car.Engine().run()
}

class Car6 {
    private val engine = Engine()
    var speed = 100
    fun drive() {
        engine.run()
        println("Driving at speed $speed")
    }

   private inner class Engine {
        val rpm = 1000
        fun run() {
            println("Engine is running at rpm $rpm")
            this@Car6.speed = 50
            this@Car6.drive()
        }
    }
}