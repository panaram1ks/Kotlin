fun main(args: Array<String>) {
    var myCar = Car5().apply {
        speed = 50
        color = "red"
        startCar()
    }
}

class Car5 {
    var speed = 10
    var color = "blue"
    fun startCar() {
        println("Starting the car, speed is $speed, color is $color")
    }
}