package com.peterservice.rtco.crm.nano.composite.service.extensions

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCancellationCompositeDto
import com.peterservice.rtco.sfa.api.dto.SalesCancellationDto

/**
 * @author Daniil.Makarov
 */
fun SalesCancellationCompositeDto.convert(): SalesCancellationDto = SalesCancellationDto(this.cancelReason)