package com.peterservice.rtco.crm.nano.composite.api.dto.sale

import java.time.Instant

data class SaleCompositeDto(
        val saleId: Long?,
        val saleStartDate: Instant,
        val saleEndDate: Instant?,
        val custCustId: Long,
        val sstatSstatId: Long,
        val cancelReason: String?,
        val cntrCntrId: Long
)

