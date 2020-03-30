package com.example.utmnews.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utmnews.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utmnews.data.adapters.ArticlesAdapter
import com.example.utmnews.data.api.testArticles
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: ArticlesAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        adapter = ArticlesAdapter()
        adapter.setArticles(testArticles)
        recyclerView.adapter = adapter

    }
}
