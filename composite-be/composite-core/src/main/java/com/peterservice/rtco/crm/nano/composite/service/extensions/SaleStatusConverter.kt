package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleStatusCompositeDto
import com.peterservice.rtco.sfa.api.dto.SaleStatusDto

/**
 * @author Daniil.Makarov
 */
fun SaleStatusDto.convert(): SaleStatusCompositeDto = SaleStatusCompositeDto(
        sstatId = this.sstatId,
        keyName = this.keyName,
        name = this.name,
        isActiveYn = this.isActiveYn
)