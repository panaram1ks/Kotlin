import kotlin.random.Random

fun main(args: Array<String>){
    val nextInt = Random.nextInt()
    println(nextInt)
    println(Random.nextInt(10))
    println(Random.nextInt(20, 30))
    println(Random.nextDouble())
}