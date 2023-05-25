package br.com.jones.library.core.base

import androidx.annotation.VisibleForTesting
import br.com.jones.library.core.base.interceptors.DefaultInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

abstract class BaseServiceFactory<T>(private val apiType: Class<T>) {

    @VisibleForTesting(otherwise = VisibleForTesting.PROTECTED)
    val api: T = createApi()

    private fun createApi(): T {
        return Retrofit.Builder()
            .client(createOkhttpClient().build())
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(apiType)
    }

    private fun createOkhttpClient(): OkHttpClient.Builder =
        OkHttpClient.Builder()
            .addInterceptor(DefaultInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)


    companion object {
        const val BASE_URL = "https://api.thecatapi.com/v1/"
    }

}