fun main(args: Array<String>) {
//    val car = CarMy("BMW", 300)
val myCar = CarMy()
  val yourCar = CarMy("BMW")
  val hisCar = CarMy("Fiat", 220)

}

//class CarMy(var model: String, var topSpeed: Int) {}


class CarMy {
  constructor(){
    model = "No model"
    topSpeed = 150
  }
  constructor(newModel: String){
    model = newModel
    topSpeed = 150
  }
  constructor(newModel: String, newTopSpeed: Int){
    model = newModel
    topSpeed = newTopSpeed
  }

  var model: String? = null
  var topSpeed = 100
}