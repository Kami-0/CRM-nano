package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.cam.dto.Customer
import com.peterservice.rtco.crm.nano.composite.dto.CustomerDto

fun Customer.toCustomerDtoComposite(): CustomerDto = CustomerDto(
        id = this.id,
        typeTypeId = this.typeTypeId,
        statusStatusId = this.statusStatusId,
        name = this.name,
        inn = this.inn,
        kpp = this.kpp,
        bankId = this.bankId
)

fun CustomerDto.toCustomerDto(): Customer = Customer(
        this.id,
        this.typeTypeId,
        this.statusStatusId,
        this.name,
        this.inn,
        this.kpp,
        this.bankId
)
