package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.composite.dto.dto.BankDtoComposite
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerStatusDtoComposite
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerTypeDtoComposite

interface DictionaryServiceComposite {

    fun getAllTypes(): List<CustomerTypeDtoComposite>

    fun getAllStatuses(): List<CustomerStatusDtoComposite>

    fun getAllBanks(): List<BankDtoComposite>

    fun getTypeById(id: Long): CustomerTypeDtoComposite

    fun getStatusById(id: Long): CustomerStatusDtoComposite

    fun getBankById(id: Long): BankDtoComposite
}