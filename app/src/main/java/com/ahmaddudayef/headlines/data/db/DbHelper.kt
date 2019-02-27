package com.ahmaddudayef.headlines.data.db

import com.ahmaddudayef.headlines.data.network.model.Article

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
interface DbHelper {

    fun insertArticles(articles: MutableList<Article>): List<Long>

    fun selectArticles(): List<Article>

    fun deleteArticles()
}