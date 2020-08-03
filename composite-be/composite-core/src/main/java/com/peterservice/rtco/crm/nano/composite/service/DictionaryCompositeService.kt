package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleStatusCompositeDto
import com.peterservice.rtco.crm.nano.composite.service.extensions.convert
import com.peterservice.rtco.sfa.api.DictionaryApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DictionaryCompositeService(
        @Autowired
        private val dictionaryApi: DictionaryApi
) {
    fun getAllSaleStatuses(): List<SaleStatusCompositeDto>? = dictionaryApi.allSaleStatuses.map { it.convert() }

    fun getSaleStatusById(id: Long): SaleStatusCompositeDto = dictionaryApi.getSaleStatusById(id).convert()
}