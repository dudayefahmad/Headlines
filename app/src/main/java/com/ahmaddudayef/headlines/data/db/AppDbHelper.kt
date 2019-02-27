package com.ahmaddudayef.headlines.data.db

import com.ahmaddudayef.headlines.data.db.room.AppDatabase
import com.ahmaddudayef.headlines.data.network.model.Article
import javax.inject.Inject

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
class AppDbHelper @Inject constructor(private val appDatabase: AppDatabase): DbHelper {

    override fun insertArticles(articles: MutableList<Article>): List<Long> {
        return appDatabase.articleDao().insertArticles(articles)
    }

    override fun selectArticles(): List<Article> {
        return appDatabase.articleDao().selectArticles()
    }

    override fun deleteArticles() {
        return appDatabase.articleDao().deleteArticles()
    }

}