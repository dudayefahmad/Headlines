package com.ahmaddudayef.headlines.data.db.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.ahmaddudayef.headlines.data.network.model.Article

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertArticles(articles: MutableList<Article>): List<Long>

    @Query("SELECT * FROM articles")
    fun selectArticles(): List<Article>

    @Query("DELETE FROM articles")
    fun deleteArticles()
}