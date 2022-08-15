package com.practice.seongjin.service

import com.practice.seongjin.datasource.BankDataSource
import com.practice.seongjin.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService (private val dataSource: BankDataSource){
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}