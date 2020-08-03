package com.peterservice.rtco.crm.nano.composite.controller

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleStatusCompositeDto
import com.peterservice.rtco.crm.nano.composite.service.DictionaryCompositeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DictionaryCompositeController(
        @Autowired
        private val dictionaryCompositeService: DictionaryCompositeService
) {
    @GetMapping(value = ["/sale/statuses"])
    fun getAllSaleStatuses(): List<SaleStatusCompositeDto>? = dictionaryCompositeService.getAllSaleStatuses()

    @GetMapping(value = ["/sale/statuses/{id}"])
    fun getSaleStatusById(@PathVariable id: Long): SaleStatusCompositeDto = dictionaryCompositeService.getSaleStatusById(id)
}