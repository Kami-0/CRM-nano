package com.peterservice.sfa.util;

import com.peterservice.sfa.domain.SaleStatusEntity;
import com.peterservice.sfa.dto.SaleStatusDto;
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
