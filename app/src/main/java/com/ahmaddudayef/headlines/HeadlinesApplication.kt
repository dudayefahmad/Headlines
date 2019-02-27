package com.ahmaddudayef.headlines

import android.app.Activity
import android.app.Application
import com.ahmaddudayef.headlines.di.component.DaggerApplicationComponent
import com.amitshekhar.DebugDB
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
class HeadlinesApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this)

        Timber.plant(Timber.DebugTree())

        DebugDB.getAddressLog()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }
}