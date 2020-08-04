package com.peterservice.rtco.sfa.model;

import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;

public final class SaleStatusDtoTest {
    private static final long OPEN_STATUS_ID = 1;

    public static SaleStatusDto getOpenInstance() {
        return SaleStatusDto.builder()
                .sstatId(OPEN_STATUS_ID)
                .keyName("OPEN")
                .name("open")
                .isActiveYn(true)
                .build();
    }
}
