package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.cam.DictionaryApi
import com.peterservice.rtco.crm.nano.composite.dto.BankDto
import com.peterservice.rtco.crm.nano.composite.dto.CustomerStatusDto
import com.peterservice.rtco.crm.nano.composite.dto.CustomerTypeDto
import com.peterservice.rtco.crm.nano.composite.service.extensions.toBankDtoComposite
import com.peterservice.rtco.crm.nano.composite.service.extensions.toCustomerStatusDtoComposite
import com.peterservice.rtco.crm.nano.composite.service.extensions.toCustomerTypeDtoComposite

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DictionaryImpCompositeService (
        @Autowired
        private val dictionaryApi: DictionaryApi
) : DictionaryCompositeService
{
    override fun getAllTypes(): List<CustomerTypeDto> {
        val customerTypes = dictionaryApi.allCustomersType
        return customerTypes.map{ it.toCustomerTypeDtoComposite()}
    }

    override fun getAllStatuses(): List<CustomerStatusDto> {
        val customerStatuses = dictionaryApi.allCustomersStatus
        return customerStatuses.map { it.toCustomerStatusDtoComposite() }
    }

    override fun getAllBanks(): List<BankDto> {
        val banks = dictionaryApi.allBanks
        return banks.map { it.toBankDtoComposite() }
    }

    override fun getTypeById(id: Long) = dictionaryApi
            .getTypeById(id)
            .toCustomerTypeDtoComposite()

    override fun getStatusById(id: Long) = dictionaryApi
            .getStatusById(id)
            .toCustomerStatusDtoComposite()

    override fun getBankById(id: Long) = dictionaryApi
            .getBankById(id)
            .toBankDtoComposite()
}