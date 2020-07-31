package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.cam.DictionaryApi
import com.peterservice.rtco.crm.nano.composite.dto.dto.BankDtoComposite
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerStatusDtoComposite
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerTypeDtoComposite
import com.peterservice.rtco.crm.nano.composite.service.extensions.toBankDtoComposite
import com.peterservice.rtco.crm.nano.composite.service.extensions.toCustomerStatusDtoComposite
import com.peterservice.rtco.crm.nano.composite.service.extensions.toCustomerTypeDtoComposite
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DictionaryServiceImpComposite (
        @Autowired
        private val dictionaryApi: DictionaryApi
) : DictionaryServiceComposite
{
    override fun getAllTypes(): List<CustomerTypeDtoComposite> {
        val customerTypes = dictionaryApi.allCustomersType
        return customerTypes.map{ it.toCustomerTypeDtoComposite()}
    }

    override fun getAllStatuses(): List<CustomerStatusDtoComposite> {
        val customerStatuses = dictionaryApi.allCustomersStatus
        return customerStatuses.map { it.toCustomerStatusDtoComposite() }
    }

    override fun getAllBanks(): List<BankDtoComposite> {
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