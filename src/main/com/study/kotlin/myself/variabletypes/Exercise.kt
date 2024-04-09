fun main(args: Array<String>){
    println("please input a numbef")
    val input = readLine()?:"";
    val intVal = input.toInt()
    val d1 = 47.83
    val  result = intVal *d1
    println(result)
    println(result::class.java)
}