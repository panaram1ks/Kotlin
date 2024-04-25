import kotlin.random.Random

fun main(args: Array<String>) {
    val list = provideListAnimals()
    list.forEach {
        if (it is CatAA) {
            it.purr()
        } else if (it is DogAA) {
            it.bark()
        }
    }
}

abstract class AnimalA

class CatAA : AnimalA() {
    fun purr() {
        println("Cat is purring")
    }
}

class DogAA : AnimalA() {
    fun bark() {
        println("Dog is barking")
    }
}

fun provideListAnimals(): ArrayList<AnimalA> {
    val random = Random
    var list = arrayListOf<AnimalA>()

    for (i in 0..10) {
        val num = random.nextInt()
        if (num % 2 == 0) {
            list.add((CatAA() as AnimalA))
        } else {
            list.add((DogAA() as AnimalA))
        }
    }
    return list
}
