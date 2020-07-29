package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.cam.dto.BankDto
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatusDto
import com.peterservice.rtco.crm.nano.cam.dto.CustomerTypeDto
import com.peterservice.rtco.crm.nano.composite.dto.dto.BankDtoComposite
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerStatusDtoComposite
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerTypeDtoComposite

fun BankDto.toBankDtoComposite(): BankDtoComposite = BankDtoComposite(
        bankId = this.bankId,
        name = this.name,
        address = this.address,
        bik = this.bik,
        corrAccount = this.corrAccount,
        inn = this.inn,
        kpp = this.kpp,
        startDate = this.startDate,
        endDate = this.endDate,
        lastChgDate = this.lastChgDate
)

fun CustomerStatusDto.toCustomerStatusDtoComposite(): CustomerStatusDtoComposite = CustomerStatusDtoComposite(
        statusId = this.statusId,
        name = this.name,
        keyName = this.keyName
)

fun CustomerTypeDto.toCustomerTypeDtoComposite(): CustomerTypeDtoComposite = CustomerTypeDtoComposite(
        typeId = this.typeId,
        keyName = this.keyName,
        name = this.name
)
