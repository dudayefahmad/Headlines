package com.ahmaddudayef.headlines.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import android.support.customtabs.CustomTabsIntent
import android.support.v4.content.ContextCompat
import com.ahmaddudayef.headlines.HeadlinesApplication
import com.ahmaddudayef.headlines.R
import com.ahmaddudayef.headlines.data.AppDataManager
import com.ahmaddudayef.headlines.data.Config
import com.ahmaddudayef.headlines.data.DataManager
import com.ahmaddudayef.headlines.data.db.AppDbHelper
import com.ahmaddudayef.headlines.data.db.DbHelper
import com.ahmaddudayef.headlines.data.db.room.AppDatabase
import com.ahmaddudayef.headlines.data.network.ApiHelper
import com.ahmaddudayef.headlines.data.network.AppApiHelper
import com.ahmaddudayef.headlines.di.ApplicationContext
import com.ahmaddudayef.headlines.di.BaseUrl
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
@Module
class ApplicationModule {
    @Provides
    @ApplicationContext
    internal fun provideContext(headlinesApplication: HeadlinesApplication): Context {
        return headlinesApplication.applicationContext
    }

    @Provides
    internal fun provideApplication(headlinesApplication: HeadlinesApplication): Application {
        return headlinesApplication
    }

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }

    @Provides
    fun provideCustomTabIntent(@ApplicationContext context: Context): CustomTabsIntent {
        return CustomTabsIntent.Builder()
                .setToolbarColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .setSecondaryToolbarColor(ContextCompat.getColor(context, R.color.colorPrimaryDark))
                .addDefaultShareMenuItem()
                .build()
    }

    @Provides
    @BaseUrl
    internal fun provideBaseUrl(): String {
        return Config.BASE_URL
    }

    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, Config.DB_NAME)
                .setJournalMode(RoomDatabase.JournalMode.TRUNCATE)
                .build()
    }

    @Provides
    @Singleton
    internal fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

    @Provides
    @Singleton
    internal fun provideDbHelper(appDbHelper: AppDbHelper): DbHelper {
        return appDbHelper
    }

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }
}