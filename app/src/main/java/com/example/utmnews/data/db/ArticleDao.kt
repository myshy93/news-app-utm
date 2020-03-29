package com.example.utmnews.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ArticleDao {


    @Query("SELECT * from articles_table ORDER BY publishedAt DESC")
    fun getAllArticles(): LiveData<List<ArticleEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addArticle(articleList: List<ArticleEntity>)

    @Delete
    fun deleteArticle(articleList: List<ArticleEntity>)

}