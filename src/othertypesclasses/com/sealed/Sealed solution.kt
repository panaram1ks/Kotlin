import kotlin.random.Random

fun main(args: Array<String>) {
    for (i in 0..5) {
        val whichClass = Random.nextInt(1, 4)
        val prize = getPrize(whichClass)
        println(prize)
    }
}

fun getPrize(whichClass: Int): Prize {
    return when (whichClass) {
        1 -> VW()
        2 -> FranceHoliday()
        else -> Dollar10()
    }
}

abstract class Prize

sealed class CarPrize : Prize()
sealed class VacationPrize : Prize()
sealed class GiftCardPrize : Prize()

class VW : CarPrize()
class FranceHoliday : VacationPrize()
class Dollar10 : GiftCardPrize()