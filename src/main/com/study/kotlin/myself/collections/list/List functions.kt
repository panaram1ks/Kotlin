package com.study.kotlin.myself.collections.list

fun main(args: Array<String>) {
    var colors = arrayListOf("blue", "red", "blue", "green")
    println(colors.size)
    println(colors.contains("green"))
    println(colors.contains("pink"))

    val newColors = listOf("red","green")
    println(colors.containsAll(newColors))

    println(colors.indexOf("blue"))
    colors.set(1, "redder")
    println(colors)
}