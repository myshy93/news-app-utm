package com.example.utmnews.data.adapters

import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.utmnews.R
import com.example.utmnews.data.api.TestArticle
import com.example.utmnews.data.api.testArticles
import com.example.utmnews.inflate
import com.example.utmnews.ui.ArticleActivity
import kotlinx.android.synthetic.main.article_fragment.view.*


class ArticlesAdapter : RecyclerView.Adapter<ArticlesAdapter.ArticleHolder>()  {

    private lateinit var articles: List<TestArticle>

    fun setArticles(articles: List<TestArticle>) {
        this.articles = articles
    }

    companion object ExtraKeys {
        const val article_id: String = "ARTICLE_ID"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleHolder {
        val inflatedView = parent.inflate(R.layout.article_fragment, false)
        return ArticleHolder(inflatedView)

    }

    override fun getItemCount(): Int {
        return this.articles.size
    }


    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {
        val item = testArticles[position]
        holder.bind(item)
        val view = holder.getView()
        view.setOnClickListener {
            val context = it.context
            val intent = Intent(context, ArticleActivity::class.java)
            intent.putExtra(article_id, position)
            context.startActivity(intent)
        }

    }

    class ArticleHolder(v: View): RecyclerView.ViewHolder(v) {

        private var view: View = v
        private var article: TestArticle? = null


        companion object {
            private val ARTICLE_KEY = "ARTICLE"
        }

        fun getView(): View {
            return view
        }

        fun bind(article: TestArticle) {
            this.article = article
            view.article_title.text = article.name
            view.article_description.text = article.category
        }


    }
}

