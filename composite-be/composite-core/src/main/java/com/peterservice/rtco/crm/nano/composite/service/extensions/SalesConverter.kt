package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleCompositeDto
import com.peterservice.rtco.sfa.api.dto.SaleDto

/**
 * @author Daniil.Makarov
 */
fun SaleDto.convert() = SaleCompositeDto(
        saleId = this.saleId,
        saleStartDate = this.saleStartDate,
        saleEndDate = this.saleEndDate,
        custCustId = this.custCustId,
        sstatSstatId = this.sstatSstatId,
        cancelReason = this.cancelReason,
        cntrCntrId = this.cntrCntrId
)
