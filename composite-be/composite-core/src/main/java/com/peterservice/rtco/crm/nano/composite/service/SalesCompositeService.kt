package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCancellationCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCompositeCreationDto
import com.peterservice.rtco.crm.nano.composite.service.extensions.convert
import com.peterservice.rtco.sfa.api.SalesApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SalesCompositeService(
        @Autowired
        private var salesApi: SalesApi
) {
    fun getSaleById(id: Long): SaleCompositeDto = salesApi.getSaleById(id).convert()

    fun createSale(salesCompositeCreationDto: SalesCompositeCreationDto): SaleCompositeDto =
            salesApi.createSale(salesCompositeCreationDto.convert()).convert()

    fun cancelSale(salesCancellationCompositeDto: SalesCancellationCompositeDto, id: Long): SaleCompositeDto =
            salesApi.cancelSale(salesCancellationCompositeDto.convert(), id).convert()

    fun closeSale(id: Long): SaleCompositeDto = salesApi.closeSale(id).convert()

    fun deleteSale(id: Long) = salesApi.deleteSale(id)
}