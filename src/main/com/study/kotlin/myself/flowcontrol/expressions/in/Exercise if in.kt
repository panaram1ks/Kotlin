fun main(args: Array<String>){
    println("Please enter your age")
    var age = readLine()?:"1"
    var ageNumber = age.toInt()

    if (ageNumber == 0) ageNumber = 1

    if(ageNumber < 13) println("They are child")
    else if(ageNumber < 18) println("They are teen")
    else println("They are adult")
}