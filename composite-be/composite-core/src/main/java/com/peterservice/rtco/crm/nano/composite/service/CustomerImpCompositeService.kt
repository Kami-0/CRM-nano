package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.cam.CustomerApi
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerDto
import com.peterservice.rtco.crm.nano.composite.service.extensions.toCustomerDto
import com.peterservice.rtco.crm.nano.composite.service.extensions.toCustomerDtoComposite
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerImpCompositeService (
        @Autowired
        private val customerApi: CustomerApi
) : CustomerCompositeService
{
    override fun getById(id: Long) = customerApi
            .getCustomerById(id)
            .toCustomerDtoComposite()

    override fun getByName(name: String) = customerApi
            .getCustomerByName(name)
            .toCustomerDtoComposite()

    override fun getAll(limit: Int, offset: Int): List<CustomerDto> {
        val customers = customerApi.getAllCustomers(limit, offset)
        return customers.map { it.toCustomerDtoComposite() }
        //return customers.map(CustomerDto::toCustomerDtoComposite)
    }

    override fun update(id: Long, customerDto: CustomerDto): CustomerDto {
        val customer = customerDto.toCustomerDto()
        val updatedCustomer = customerApi.updateCustomer(id, customer)
        return updatedCustomer.toCustomerDtoComposite()
    }

    override fun create(customerDto: CustomerDto): CustomerDto {
        val customer = customerDto.toCustomerDto()
        val createCustomer = customerApi.createCustomer(customer)
        return createCustomer.toCustomerDtoComposite()
    }

    override fun delete (id: Long) {
        customerApi.deleteCustomer(id)
    }
}