package com.peterservice.rtco.crm.nano.composite.dto.dto

import java.util.*

data class BankDtoComposite(
    var bankId: Long,
    var name: String,
    var address: String,
    var corrAccount: String,
    var bik: Long,
    var inn: Long,
    var kpp: Long,
    var startDate: Date,
    var endDate: Date,
    var lastChgDate: Date
)