package com.peterservice.rtco.sfa.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SaleDto {
    private long saleId;
    private LocalDateTime saleStartDate;
    private LocalDateTime saleEndDate;
    private long custCustId;
    private long sstatSstatId;
    private String cancelReason;
    private long cntrCntrId;
}
