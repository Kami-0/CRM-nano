package com.peterservice.rtco.crm.nano.composite.api

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCancellationCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCompositeCreationDto

/**
 * @author Daniil.Makarov
 */
interface SaleCompositeApi {

    fun getSaleById(id: Long): SaleCompositeDto

    fun createSale(salesCompositeCreationDto: SalesCompositeCreationDto): SaleCompositeDto

    fun cancelSale(salesCancellationCompositeDto: SalesCancellationCompositeDto, id: Long): SaleCompositeDto

    fun closeSale(id: Long): SaleCompositeDto

    fun deleteSale(id: Long)
}