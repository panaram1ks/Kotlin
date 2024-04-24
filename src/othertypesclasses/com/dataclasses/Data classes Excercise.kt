package com.dataclasses

fun main(args: Array<String>) {
    val articles = arrayListOf<Article>()
    articles.add(Article("water", "text about liquid", 100))
    articles.add(Article("fire", "text about burning", 300))
    println(articles)

    val newOneArticle = articles[0].copy(title = "clean water")
    articles.add(newOneArticle)

    println(articles)

}

data class Article(
    val title: String,
    val content: String,
    val numberOfReaders: Int
)