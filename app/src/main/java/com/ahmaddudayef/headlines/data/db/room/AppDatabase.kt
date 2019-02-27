package com.ahmaddudayef.headlines.data.db.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.ahmaddudayef.headlines.data.network.model.Article

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
@Database(entities = [Article::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
}