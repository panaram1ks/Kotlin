fun main(args: Array<String>){
    val cat = Animal()
    cat.run()

    cat.name = "Vaska"
    cat.topSpeed = 70
    cat.run()
}

class Animal {
    var name = ""
    var topSpeed = 0

    fun run(){
        println("$name's top speed is $topSpeed")
    }
}