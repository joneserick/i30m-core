package br.com.jones.library.core.base

import br.com.jones.library.core.base.interceptors.DefaultInterceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

abstract class ServiceFactory<T>(apiType: Class<T>) : br.com.jones.library.core.base.BaseServiceFactory<T>(apiType) {

    override fun createOkhttpClient(): OkHttpClient.Builder {
        return OkHttpClient.Builder()
            .addInterceptor(br.com.jones.library.core.base.interceptors.DefaultInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
    }

}