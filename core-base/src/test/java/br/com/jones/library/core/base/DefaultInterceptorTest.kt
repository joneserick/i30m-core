package br.com.jones.library.core.base

import br.com.jones.library.core.base.interceptors.DefaultInterceptor
import io.mockk.every
import io.mockk.spyk
import io.mockk.verify
import okhttp3.Interceptor
import okhttp3.Request
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class DefaultInterceptorTest {

    private lateinit var interceptor: Interceptor

    @Before
    fun setUp() {
        interceptor = DefaultInterceptor()
    }

    @Test
    fun `should setup the default headers and check it proceed on the request interception`() {

        val chain = spyk<Interceptor.Chain>()

        every { chain.request() } answers {
            Request.Builder()
                .url("https://mockkrequest.jones")
                .build()
        }

        interceptor.intercept(chain)

        verify {
            chain.request()
            chain.proceed(any())
        }
    }

}