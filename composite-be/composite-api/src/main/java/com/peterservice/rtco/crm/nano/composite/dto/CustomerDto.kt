package com.peterservice.rtco.crm.nano.composite.dto

data class CustomerDto(
    val id: Long?,
    val typeTypeId: Long,
    val statusStatusId: Long,
    val name: String,
    val inn: Long,
    val kpp: Long,
    val bankId: Long
)