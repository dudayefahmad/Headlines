package com.ahmaddudayef.headlines.data

import com.ahmaddudayef.headlines.data.db.AppDbHelper
import com.ahmaddudayef.headlines.data.network.AppApiHelper
import com.ahmaddudayef.headlines.data.network.model.Article
import com.ahmaddudayef.headlines.data.network.model.Headlines
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
class AppDataManager @Inject constructor(
        private val appApiHelper: AppApiHelper,
        private val appDbHelper: AppDbHelper
): DataManager {

    override fun getArticles(): Observable<Headlines?> {
        return appApiHelper.getArticles()
    }

    override fun insertArticles(articles: MutableList<Article>): List<Long> {
        return appDbHelper.insertArticles(articles)
    }

    override fun selectArticles(): List<Article> {
        return appDbHelper.selectArticles()
    }

    override fun deleteArticles() {
        return appDbHelper.deleteArticles()
    }

}