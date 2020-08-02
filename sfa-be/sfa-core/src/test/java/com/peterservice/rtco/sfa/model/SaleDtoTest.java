package com.peterservice.rtco.sfa.model;

import com.peterservice.rtco.sfa.api.dto.SaleDto;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public final class SaleDtoTest {

    public static SaleDto getValidOpenInstance() {
        return SaleDto.builder()
                .saleId(1L)
                .saleStartDate(Instant.MIN)
                .sstatSstatId(1L)
                .cntrCntrId(1L)
                .custCustId(1L)
                .build();
    }

    public static SaleDto getValidCancelInstance() {
        return SaleDto.builder()
                .saleId(1L)
                .saleStartDate(Instant.MIN)
                .sstatSstatId(2L)
                .cntrCntrId(1L)
                .custCustId(1L)
                .cancelReason("test")
                .build();
    }

    public static SaleDto getValidCloseInstance() {
        return SaleDto.builder()
                .saleId(1L)
                .saleStartDate(Instant.MIN)
                .sstatSstatId(3L)
                .cntrCntrId(1L)
                .custCustId(1L)
                .build();
    }
}
