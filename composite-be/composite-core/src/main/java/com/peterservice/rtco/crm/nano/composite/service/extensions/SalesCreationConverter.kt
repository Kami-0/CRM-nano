package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCompositeCreationDto
import com.peterservice.rtco.sfa.api.dto.SalesCreationDto

/**
 * @author Daniil.Makarov
 */
fun SalesCompositeCreationDto.convert(): SalesCreationDto = SalesCreationDto.builder()
        .cntrCntrId(this.cntrCntrId)
        .custCustId(this.custCustId)
        .build()