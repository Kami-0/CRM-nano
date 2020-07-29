package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.cam.dto.CustomerDto
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerDtoComposite

fun CustomerDto.toCustomerDtoComposite(): CustomerDtoComposite = CustomerDtoComposite(
        id = this.id,
        typeTypeId = this.typeTypeId,
        statusStatusId = this.statusStatusId,
        name = this.name,
        inn = this.inn,
        kpp = this.kpp,
        bankId = this.bankId
)

fun CustomerDtoComposite.toCustomerDto(): CustomerDto = CustomerDto(
        this.id,
        this.typeTypeId,
        this.statusStatusId,
        this.name,
        this.inn,
        this.kpp,
        this.bankId
)
