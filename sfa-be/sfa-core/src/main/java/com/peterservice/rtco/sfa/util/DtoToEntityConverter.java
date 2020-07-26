package com.peterservice.rtco.sfa.util;

import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;
import com.peterservice.rtco.sfa.domain.SaleStatusEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DtoToEntityConverter {
    public static SaleStatusDto convert(SaleStatusEntity saleStatusEntity) {
        return new SaleStatusDto(
                saleStatusEntity.getSstatId(),
                saleStatusEntity.getKeyName(),
                saleStatusEntity.getName(),
                saleStatusEntity.isActiveYn()
        );
    }
}
