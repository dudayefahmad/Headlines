package com.ahmaddudayef.headlines.di.module

import com.ahmaddudayef.headlines.ui.news.NewsActivity
import com.ahmaddudayef.headlines.ui.news.NewsActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
@Module
abstract class ActivityBindingModule{

    @ContributesAndroidInjector(modules = [(NewsActivityModule::class)])
    abstract fun bindNewsActivity(): NewsActivity
}