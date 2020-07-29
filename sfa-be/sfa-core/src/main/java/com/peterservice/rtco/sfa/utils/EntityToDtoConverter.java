package com.peterservice.rtco.sfa.utils;

import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.domain.SaleEntity;
import com.peterservice.rtco.sfa.domain.SaleStatusEntity;

/**
 * @author Daniil.Makarov
 */
public final class EntityToDtoConverter {
    public static SaleEntity convert(SaleDto saleDto, SaleStatusEntity saleStatusEntity) {
        return new SaleEntity(
                saleDto.getSaleId(),
                saleDto.getSaleStartDate(),
                saleDto.getSaleEndDate(),
                saleDto.getCustCustId(),
                saleStatusEntity,
                saleDto.getCancelReason(),
                saleDto.getCntrCntrId()
        );
    }
}
