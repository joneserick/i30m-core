package br.com.jones.library.core.mocks

import br.com.jones.library.core.base.BaseServiceFactory

class MockService: BaseServiceFactory<MockApi>(MockApi::class.java), MockApi  {

    override fun getMock() {
        api.getMock()
    }

    override fun postMock() {
        api.postMock()
    }


}