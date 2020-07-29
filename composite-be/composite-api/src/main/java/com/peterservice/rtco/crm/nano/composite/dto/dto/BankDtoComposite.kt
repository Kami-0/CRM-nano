package com.peterservice.rtco.crm.nano.composite.dto.dto

import javax.xml.crypto.Data

data class BankDtoComposite (
    var bankId: Long,
    var name: String,
    var address: String,
    var corrAccount: String,
    var bik: Long,
    var inn: Long,
    var kpp: Long,
    var startDate: Data,
    var endDate: Data,
    var lastChgDate: Data
)