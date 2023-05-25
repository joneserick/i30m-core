package br.com.jones.library.core.base

import br.com.jones.library.core.mocks.MockApi
import br.com.jones.library.core.mocks.MockService
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertIs

@RunWith(JUnit4::class)
class BaseServiceFactoryTest {

    private lateinit var service: BaseServiceFactory<MockApi>

    @Before
    fun setUp() {
        service = MockService()
    }

    @Test
    fun `should create a service instance of desired API class`() {
        assertIs<MockApi>(service.api)
    }


}