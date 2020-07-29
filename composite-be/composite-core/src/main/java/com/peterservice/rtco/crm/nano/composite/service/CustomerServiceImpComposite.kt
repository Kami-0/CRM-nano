package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.cam.CamCustomerApiFeign
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerDtoComposite
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpComposite(
        @Autowired
        private val camCustomerApiFeign: CamCustomerApiFeign)
    : CustomerServiceComposite
{
    fun getById(id: Long): CustomerDtoComposite {
        val customer = camCustomerApiFeign.getCustomerById(id)
        return CustomerDtoComposite(
                id = customer.id,
                typeTypeId = customer.typeTypeId,
                statusStatusId = customer.statusStatusId,
                name = customer.name,
                inn = customer.inn,
                kpp = customer.kpp,
                bankId = customer.bankId
        )
    }

}