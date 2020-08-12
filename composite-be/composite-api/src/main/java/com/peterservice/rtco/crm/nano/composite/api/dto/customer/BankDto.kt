package com.peterservice.rtco.crm.nano.composite.api.dto.customer

import java.util.*

data class BankDto(
    val bankId: Long,
    val name: String,
    val address: String,
    val corrAccount: String,
    val bik: Long,
    val inn: Long,
    val kpp: Long,
    val startDate: Date,
    val endDate: Date,
    val lastChgDate: Date
)