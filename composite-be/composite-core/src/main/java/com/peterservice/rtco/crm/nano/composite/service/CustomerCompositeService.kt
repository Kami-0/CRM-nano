package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.composite.dto.CustomerDto

interface CustomerCompositeService {

    fun getById(id: Long): CustomerDto

    fun getByName(name: String): CustomerDto

    fun getAll(limit: Int, offset: Int): List<CustomerDto>

    fun update(id: Long, customerDto: CustomerDto): CustomerDto

    fun create(customerDto: CustomerDto): CustomerDto

    fun delete (id: Long)
}
