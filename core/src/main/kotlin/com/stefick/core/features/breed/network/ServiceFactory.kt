package com.stefick.core.features.breed.network

import com.stefick.core.base.BaseServiceFactory
import com.stefick.core.base.interceptors.DefaultInterceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

abstract class ServiceFactory<T>(apiType: Class<T>) : BaseServiceFactory<T>(apiType) {

    override fun createOkhttpClient(): OkHttpClient.Builder {
        return OkHttpClient.Builder()
            .addInterceptor(DefaultInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
    }

}