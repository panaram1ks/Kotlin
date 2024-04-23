fun main(args: Array<String>) {
    Car5().apply {
        speed = 80
        startCar()
    }
        .also {
            println("Car is running")
            println("Car speed is ${it.speed}")
        }
}