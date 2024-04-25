fun main(args: Array<String>) {
    val value = "Testing my string"
    if (value is String) println("This string has ${value.length} characters")

    val myCar: Car11 = getCar()
    if (myCar !is BMW) {
        println("This is not my favourite brand")
    }

    if (myCar is Car11) {
        (myCar as BMW).drive()
    }

    val bmwCar: BMW? = myCar as? BMW
    bmwCar?.drive()
}

open class Car11 {}
class BMW : Car11() {
    fun drive() {
        println("Driving my BMW")
    }
}

//fun getCar(): Car11 = Car11()
fun getCar(): Car11 = BMW()