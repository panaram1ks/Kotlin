fun main(args: Array<String>) {
    val myCar = Car3()
}

class Car3 {
    val model = "no model"
    val topSpeed = 100

    init {
        println("This car is a  $model and has a top speed of $topSpeed")
    }
}