fun main(args: Array<String>){
    with(Car2()){
        speed = 80
        drive()
        println("Car is driving")
    }
}

class Car2 {
    var speed = 50
    fun drive(){
        println("Drive at $speed")
    }
}