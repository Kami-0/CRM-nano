package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCompositeCreationDto
import com.peterservice.rtco.sfa.api.dto.SalesCreationDto

fun SalesCompositeCreationDto.convert(): SalesCreationDto = SalesCreationDto.builder()
        .cntrCntrId(this.cntrCntrId)
        .custCustId(this.custCustId)
        .build()