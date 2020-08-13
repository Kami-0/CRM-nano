package com.peterservice.rtco.crm.nano.composite.feign

import com.peterservice.rtco.crm.nano.composite.api.DictionaryCompositeApi
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.BankDto
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerStatusDto
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerTypeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleStatusCompositeDto
import feign.Param
import feign.RequestLine

/**
 * @author Daniil.Makarov
 */
interface DictionaryCompositeApiFeign : DictionaryCompositeApi {

    @RequestLine("GET /dictionary/sale/statuses")
    override fun getAllSaleStatuses(): List<SaleStatusCompositeDto>?

    @RequestLine("GET /dictionary/sale/statuses/{id}")
    override fun getSaleStatusById(@Param("id") id: Long): SaleStatusCompositeDto

    @RequestLine("GET /dictionary/banks")
    override fun getAllBanks(): List<BankDto>

    @RequestLine("GET /dictionary/banks/{id}")
    override fun getBankById(@Param("id") id: Long): BankDto

    @RequestLine("GET /dictionary/types")
    override fun getAllCustomersType(): List<CustomerTypeDto>

    @RequestLine("GET /dictionary/types/{id}")
    override fun getTypeById(@Param("id") id: Long): CustomerTypeDto

    @RequestLine("GET /statuses")
    override fun getAllCustomersStatus(): List<CustomerStatusDto>

    @RequestLine("GET /dictionary/statuses/{id}")
    override fun getStatusById(@Param("id") id: Long): CustomerStatusDto
}