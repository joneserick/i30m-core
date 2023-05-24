package br.com.jones.library.core.base.interceptors

import br.com.jones.library.core.shared.DeveloperKey
import okhttp3.Interceptor
import okhttp3.Response

class DefaultInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val oldRequest = chain.request()

        val newRequest = oldRequest.newBuilder()
            .addHeader("x-api-key", DeveloperKey.catKey)
            .build()

        return chain.proceed(newRequest)
    }
}