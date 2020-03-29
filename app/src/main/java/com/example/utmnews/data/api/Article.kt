package com.example.utmnews.data.api


data class Article(
    val id: Int,
    val name: String,
    val category: String,
    val isRed: Boolean
)

val testArticles =
    (1..100)
        .map { number ->
            Article(
                id = number,
                name = "ArticleActivity $number",
                category = "Category ${number / 2}",
                isRed = number % 3 == 0
            )
        }