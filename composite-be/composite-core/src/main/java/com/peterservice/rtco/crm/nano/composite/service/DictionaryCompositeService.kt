package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.composite.dto.BankDto
import com.peterservice.rtco.crm.nano.composite.dto.CustomerStatusDto
import com.peterservice.rtco.crm.nano.composite.dto.CustomerTypeDto

interface DictionaryCompositeService {

    fun getAllTypes(): List<CustomerTypeDto>

    fun getAllStatuses(): List<CustomerStatusDto>

    fun getAllBanks(): List<BankDto>

    fun getTypeById(id: Long): CustomerTypeDto

    fun getStatusById(id: Long): CustomerStatusDto

    fun getBankById(id: Long): BankDto
}