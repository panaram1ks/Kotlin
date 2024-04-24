package com.dataclasses

fun main(args: Array<String>) {
    val user1 = RegualrUser("John", "john@gmail.com", "123")
    val user2 = RegualrUser("John", "john@gmail.com", "123")
    println(user1 == user2)
    println(user1.toString())
    println(user2.toString())

    val user3 = User("John", "john@gmail.com", "123")
    val user4 = User("John", "john@gmail.com", "123")
    println(user3 == user4)
    println(user3.toString())
    println(user4.toString())

}

class RegualrUser(
    val name: String,
    val email: String,
    val password: String
)

data class User(
    val name: String,
    val email: String,
    val password: String
)