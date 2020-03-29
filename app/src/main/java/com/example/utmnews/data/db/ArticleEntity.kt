package com.example.utmnews.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "articles_table")
class ArticleEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var title: String? = "",
    var source: String? = "",
    var author: String? = "",
    var description: String? = "",
    var url: String? = "",
    var urlToImage: String? = "",
    var publishedAt: Date? = Date()
)