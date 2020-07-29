package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.cam.CamCustomerApiFeign
import com.peterservice.rtco.crm.nano.cam.dto.CustomerDto
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerDtoComposite

interface CustomerServiceComposite {
    fun getById(id: Long): CustomerDtoComposite

    fun getByName(name: String):CustomerDtoComposite

    fun update(id: Long, customerDtoComposite:CustomerDtoComposite ): CustomerDtoComposite

    fun create(customerDtoComposite: CustomerDtoComposite): CustomerDtoComposite

    fun delete (id: Long)
}
