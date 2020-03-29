package com.example.utmnews.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.utmnews.R
import com.example.utmnews.data.adapters.ArticlesAdapter


class ArticleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)
        val art: TextView = findViewById<TextView>(R.id.article_id)
        art.text = intent.getIntExtra("ARTICLE_ID", 0).toString()
    }
}
