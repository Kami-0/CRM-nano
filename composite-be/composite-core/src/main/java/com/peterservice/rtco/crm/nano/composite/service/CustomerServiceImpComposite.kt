package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.cam.CamCustomerApiFeign
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerDtoComposite
import com.peterservice.rtco.crm.nano.composite.service.extensions.toCustomerDto
import com.peterservice.rtco.crm.nano.composite.service.extensions.toCustomerDtoComposite
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpComposite (
        @Autowired
        private val camCustomerApiFeign: CamCustomerApiFeign)
    : CustomerServiceComposite
{
    override fun getById(id: Long) = camCustomerApiFeign
            .getCustomerById(id)
            .toCustomerDtoComposite()

    override fun getByName(name: String) = camCustomerApiFeign
            .getCustomerByName(name)
            .toCustomerDtoComposite()

    override fun update(id: Long, customerDtoComposite: CustomerDtoComposite): CustomerDtoComposite {
        val customer = customerDtoComposite.toCustomerDto()
        val updatedCustomer = camCustomerApiFeign.updateCustomer(id, customer)
        return updatedCustomer.toCustomerDtoComposite()
    }

    override fun create(customerDtoComposite: CustomerDtoComposite): CustomerDtoComposite {
        val customer = customerDtoComposite.toCustomerDto()
        val createCustomer = camCustomerApiFeign.createCustomer(customer)
        return createCustomer.toCustomerDtoComposite()
    }

    override fun delete (id: Long) {
        camCustomerApiFeign.deleteCustomer(id)
    }
}