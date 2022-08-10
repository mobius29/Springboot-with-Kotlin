package com.practice.seongjin.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        // assertThat(banks).isNotEmpty
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        //then

        // 영상을 따라하던 도중 allSatisfy를 쓸 때, ambiguous때문에 람다 함수를 못쓰던 문제
        // assertThat(banks).allSatisfy(Consumer { it.accountNumber.isNotBlank() } )로 해결.
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }

    }
}