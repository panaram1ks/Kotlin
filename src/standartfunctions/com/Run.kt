fun main(args: Array<String>) {
    val newCar = NewCar().run {
        speed = 70
        drive()
        println("NewCar is driving")
        this
    }
    println(newCar)

    run {
        var newCar1 = NewCar()
        newCar1.speed = 100
        newCar1.drive()
    }


}

class NewCar {
    var speed = 10
    fun drive() {
        println("Car is driving at $speed")
    }
}