package com.example.utmnews.data.repo

import androidx.lifecycle.LiveData
import com.example.utmnews.data.db.ArticleDao
import com.example.utmnews.data.db.ArticleEntity

class WordRepository(private val articleDao: ArticleDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allArticles: LiveData<List<ArticleEntity>> = articleDao.getAllArticles()

    fun insert(article: ArticleEntity) {
        articleDao.addArticle(listOf(article))
    }
}