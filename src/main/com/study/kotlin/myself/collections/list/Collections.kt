package com.study.kotlin.myself.collections.list

fun main(args: Array<String>){
//    val colors = listOf("blue", "green", "yellow")
//    println(colors)
//    val colors2 = listOf<String>()
//    println(colors2)
//    var colors3 = mutableListOf("blue", "green", "yellow", null,"blue","blue")
//    println(colors3)
//    colors3[3] = "indigo"
//    println(colors3)

    val colors4 = arrayListOf("blue", "green", "yellow", null)
    println(colors4)
    colors4.add("purple")
    println(colors4)

    val colors5 = arrayListOf("pink", "teal")
    colors4.addAll(colors5)
    colors4.remove("green")
    colors4.removeAt(2)
    println(colors4)

}