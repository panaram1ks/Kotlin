fun main(args: Array<String>) {
    val herName: String = "Lilly"
    val hisName: String? = null

    println(herName)
    println(hisName)

    var catName: String? = "Chonkers"
    println(catName?.length?.toString())
    catName = null
    println(catName?.length?.toString())
}