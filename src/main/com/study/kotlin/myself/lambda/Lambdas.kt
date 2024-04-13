fun main(args: Array<String>) {
    val myLambda = { name: String -> println("Hello $name") }

    val names = arrayListOf("Alice", "Bob", "Carol")
//    sayHello(names, myLambda)
    sayHello(names) { name: String -> println("Hello $name") }

}

fun sayHello(names:ArrayList<String>, doSomething: (String) -> Unit){
    for(name in names){
        doSomething(name)
    }
}