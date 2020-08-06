package com.peterservice.rtco.sfa.model;

import com.peterservice.rtco.sfa.api.dto.SalesCreationDto;
import org.springframework.stereotype.Component;

@Component
public final class SalesCreationDtoTest {

    public static SalesCreationDto getValidInstance() {
        return SalesCreationDto.builder()
                .cntrCntrId(1L)
                .custCustId(1L)
                .build();
    }

}
