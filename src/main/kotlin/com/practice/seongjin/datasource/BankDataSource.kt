package com.practice.seongjin.datasource

import com.practice.seongjin.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>

}