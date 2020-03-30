package com.example.utmnews.data.api

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response

interface  NewsApiInterface {
    @GET("v2/everything")
    fun fetchLatestNewsAsync(
        @Query("q") query: String,
        @Query("sortBy") sortBy: String
    ): Deferred<Response<LatestNews>>
}