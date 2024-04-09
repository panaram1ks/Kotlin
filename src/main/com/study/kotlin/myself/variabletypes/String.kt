fun main(args: Array<String>) {
//    val cats = 3
//    println(cats::class.java)
//    val catsString = cats.toString()
//    println(catsString::class.java)
//
//    val pi = 3.14
//    println(pi::class.java)
//    val piString = pi.toString()
//    println(piString::class.java)

    val pi2 = 4.14159
    val pi2Float = pi2.toFloat()
    println(pi2Float::class.java)
    println(pi2Float)

    val pi2Int = pi2.toInt()
    println("pi2Int $pi2Int type: ${pi2Int::class.java}")

}