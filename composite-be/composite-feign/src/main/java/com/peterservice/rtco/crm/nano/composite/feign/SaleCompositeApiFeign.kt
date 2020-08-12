package com.peterservice.rtco.crm.nano.composite.feign

import com.peterservice.rtco.crm.nano.composite.api.SaleCompositeApi
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCancellationCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCompositeCreationDto
import feign.Headers
import feign.Param
import feign.RequestLine

interface SaleCompositeApiFeign : SaleCompositeApi {

    @RequestLine("GET /sales/{id}")
    override fun getSaleById(@Param("id") id: Long): SaleCompositeDto

    @RequestLine("POST /sales/create")
    @Headers("Content-Type: application/json")
    override fun createSale(salesCompositeCreationDto: SalesCompositeCreationDto): SaleCompositeDto

    @RequestLine("PUT /sales/{id}/cancel")
    @Headers("Content-Type: application/json")
    override fun cancelSale(salesCancellationCompositeDto: SalesCancellationCompositeDto, @Param("id") id: Long): SaleCompositeDto

    @RequestLine("PUT /sales/{id}/close")
    override fun closeSale(@Param("id") id: Long): SaleCompositeDto

    @RequestLine("DELETE /sales/{id}/delete")
    override fun deleteSale(@Param("id") id: Long)
}