fun main(args: Array<String>) {
    var table1 = Table()
    var table2 = Table(1)
    var table3 = Table(6, 250)

    table1.printInfo()
    table2.printInfo()
    table3.printInfo()
}

class Table {

    constructor(){
        legs = 3
        height = 120
    }

    constructor(newLegs:Int){
        legs = newLegs
        height = 130
    }

    constructor(newLegs: Int, newHeight: Int){
        legs = newLegs
        height = newHeight
    }

    var legs = 4
    var height =150

     fun printInfo(){
         println("This table has $legs legs and a height of $height")
     }
}