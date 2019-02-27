package com.ahmaddudayef.headlines.di.component

import com.ahmaddudayef.headlines.HeadlinesApplication
import com.ahmaddudayef.headlines.di.module.ActivityBindingModule
import com.ahmaddudayef.headlines.di.module.ApplicationModule
import com.ahmaddudayef.headlines.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    NetworkModule::class,
    ApplicationModule::class,
    ActivityBindingModule::class
])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(headlinesApplication: HeadlinesApplication): Builder

        fun build(): ApplicationComponent
    }

    fun inject(headlinesApplication: HeadlinesApplication)
}