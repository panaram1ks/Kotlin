fun main(args: Array<String>) {
    println("Please entry your birth year")
    val yearInput = readLine() ?: "";
    val year = yearInput.toInt();
    val age = 2019 - year;
    println("Your age is eaither ${age -1} or $age")
}