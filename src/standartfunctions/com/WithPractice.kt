fun main(args: Array<String>){
    with(Person1()){
        firstName = "John"
        lastName = "Smith"
        this.printOutAll()
    }
}

class Person1 {
    var firstName:String? = "fName"
    var lastName = "lName"
    var age = 10

    fun printOutAll(){
        println("Person fN: $firstName, lN: $lastName, age: $age")
    }

}