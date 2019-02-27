package com.ahmaddudayef.headlines.data.network

import com.ahmaddudayef.headlines.data.network.model.Headlines
import io.reactivex.Observable

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
interface ApiHelper {
    fun getArticles(): Observable<Headlines?>
}