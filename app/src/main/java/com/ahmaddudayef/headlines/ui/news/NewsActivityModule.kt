package com.ahmaddudayef.headlines.ui.news

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.ahmaddudayef.headlines.di.ApplicationContext
import dagger.Module
import dagger.Provides

/**
 * Created by Ahmad Dudayef on 8/16/2018.
 */
@Module
class NewsActivityModule {

    @Provides
    fun provideNewsAdapter(): ArticlesAdapter {
        return ArticlesAdapter(ArrayList())
    }

    @Provides
    fun provideLinearLayoutManager(@ApplicationContext context: Context): LinearLayoutManager {
        return LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}