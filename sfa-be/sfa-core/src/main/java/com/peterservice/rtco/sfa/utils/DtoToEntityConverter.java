package com.peterservice.rtco.sfa.utils;

import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;
import com.peterservice.rtco.sfa.domain.SaleEntity;
import com.peterservice.rtco.sfa.domain.SaleStatusEntity;

/**
 * @author Daniil.Makarov
 */
public final class DtoToEntityConverter {

    public static SaleDto convert(SaleEntity saleEntity) {
        return new SaleDto(
                saleEntity.getSaleId(),
                saleEntity.getSaleStartDate(),
                saleEntity.getSaleEndDate(),
                saleEntity.getCustCustId(),
                saleEntity.getSstatSstatId().getSstatId(),
                saleEntity.getCancelReason(),
                saleEntity.getCntrCntrId()
        );
    }

    public static SaleStatusDto convert(SaleStatusEntity saleStatusEntity) {
        return new SaleStatusDto(
                saleStatusEntity.getSstatId(),
                saleStatusEntity.getKeyName(),
                saleStatusEntity.getName(),
                saleStatusEntity.isActiveYn()
        );
    }
}
