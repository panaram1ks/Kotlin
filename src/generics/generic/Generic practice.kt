fun main(args: Array<String>) {
    val anyClass = AnyClass<Double>()
    anyClass.anyFunction(1123434.0)
}

class AnyClass<T> {

    fun anyFunction(item: T) {
        println("Length is ${item.toString().length} and toString is ${item.toString()}")
    }
}