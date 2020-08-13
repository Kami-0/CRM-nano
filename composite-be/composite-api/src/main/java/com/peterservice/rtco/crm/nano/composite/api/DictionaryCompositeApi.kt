package com.peterservice.rtco.crm.nano.composite.api

import com.peterservice.rtco.crm.nano.composite.api.dto.customer.BankDto
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerStatusDto
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerTypeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleStatusCompositeDto

/**
 * @author Daniil.Makarov
 */
interface DictionaryCompositeApi {

    fun getAllSaleStatuses(): List<SaleStatusCompositeDto>?

    fun getSaleStatusById(id: Long): SaleStatusCompositeDto

    fun getAllBanks(): List<BankDto>

    fun getBankById(id: Long): BankDto

    fun getAllCustomersType(): List<CustomerTypeDto>

    fun getTypeById(id: Long): CustomerTypeDto

    fun getAllCustomersStatus(): List<CustomerStatusDto>

    fun getStatusById(id: Long): CustomerStatusDto
}