package com.peterservice.sfa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SaleDto {
    private long sale_id;
    private LocalDateTime sale_start_date;
    private LocalDateTime sale_end_date;
    private long cust_cust_id;
    private long sstat_sstat_id;
    private String cancel_reason;
    private long cntr_cntr_id;
}
