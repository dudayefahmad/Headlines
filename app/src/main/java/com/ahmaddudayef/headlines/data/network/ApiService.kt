package com.ahmaddudayef.headlines.data.network

import com.ahmaddudayef.headlines.data.network.model.Headlines
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Ahmad Dudayef on 8/15/2018.
 */
interface ApiService {

    @GET("top-headlines")
    fun getArticles(
            @Query("country") country: String,
            @Query("apiKey") apiKey: String
    ): Observable<Headlines?>
}