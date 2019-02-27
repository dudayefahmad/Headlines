package com.ahmaddudayef.headlines.data.network

import com.ahmaddudayef.headlines.data.Config
import com.ahmaddudayef.headlines.data.network.model.Headlines
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
class AppApiHelper @Inject constructor(private val apiService: ApiService): ApiHelper {

    override fun getArticles(): Observable<Headlines?> {
        return apiService.getArticles("in", Config.API_KEY)
    }
}