package com.example.utmnews.data.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NewsApiService {
    private const val API_KEY: String = "767a6488465040c2bc839d5c0db45128"
        private val interceptor = Interceptor { chain ->
        val url = chain.request().url().newBuilder().addQueryParameter("apiKey", API_KEY).build()
        val request = chain.request()
            .newBuilder()
            .url(url)
            .build()
        chain.proceed(request)
    }

    private val apiClient = OkHttpClient().newBuilder().addInterceptor(interceptor).build()

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().client(apiClient)
            .baseUrl("https://newsapi.org/")
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }

    val newsApi: NewsApiInterface = getRetrofit().create(NewsApiInterface::class.java)
}