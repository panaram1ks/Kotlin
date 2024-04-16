fun main(args: Array<String>) {
    var car = CarA()
    car.speed = 100
    println("car.name ${car.name}")
    println("car.speed ${car.speed}")
}

class CarA {
    var name = ""
    var speed: Int
        get() = 50
        set(value) {
            name = "High speed car $value"
//            field = value
        }


}