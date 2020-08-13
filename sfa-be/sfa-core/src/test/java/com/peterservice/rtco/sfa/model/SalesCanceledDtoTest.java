package com.peterservice.rtco.sfa.model;

import com.peterservice.rtco.sfa.api.dto.SalesCancellationDto;
import org.springframework.stereotype.Component;

/**
 * @author Daniil.Makarov
 */
@Component
public final class SalesCanceledDtoTest {

    public static SalesCancellationDto getValidInstance() {
        return SalesCancellationDto
                .builder()
                .cancelReason("test")
                .build();
    }

}
