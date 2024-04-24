import kotlin.random.Random

fun main(args: Array<String>){
    val plane = AirPlane()
    plane.takeOff()
}

class AirPlane {

    fun takeOff(){
        val engine1 = Engine()
        val engine2 = Engine()
        engine1.run()
        engine2.run()
        println("Plane tookOff")
    }

    private inner class Engine{
        var numberEngine:Int = 0
        fun run(){
            numberEngine = Random.nextInt(3)
            println("Engine $numberEngine started")
        }
    }
}