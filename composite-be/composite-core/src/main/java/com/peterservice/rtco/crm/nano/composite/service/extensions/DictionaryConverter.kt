package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.cam.dto.Bank
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatus
import com.peterservice.rtco.crm.nano.cam.dto.CustomerType
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.BankDto
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerStatusDto
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerTypeDto

fun Bank.toBankDtoComposite(): BankDto = BankDto(
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

fun CustomerStatus.toCustomerStatusDtoComposite(): CustomerStatusDto = CustomerStatusDto(
        statusId = this.statusId,
        name = this.name,
        keyName = this.keyName
)

fun CustomerType.toCustomerTypeDtoComposite(): CustomerTypeDto = CustomerTypeDto(
        typeId = this.typeId,
        keyName = this.keyName,
        name = this.name
)
