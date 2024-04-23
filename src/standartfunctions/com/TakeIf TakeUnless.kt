import kotlin.random.Random

fun main(args: Array<String>) {
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    println(number)
    println(evenOrNull)
}