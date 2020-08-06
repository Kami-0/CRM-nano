package com.peterservice.rtco.crm.nano.composite.api.dto.sale

data class SaleStatusCompositeDto(
        val sstatId: Long,
        val keyName: String,
        val name: String,
        val isActiveYn: Boolean
)