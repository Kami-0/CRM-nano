package com.peterservice.rtco.sfa.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.Instant;

import static com.peterservice.rtco.sfa.api.constans.DtoConstants.*;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SaleDto {

    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long saleId;

    @NotNull(message = MESSAGE_TO_NULL_SALE_START_DATE)
    private Instant saleStartDate;

    private Instant saleEndDate;

    @NotNull(message = MESSAGE_TO_NULL_CUST_CUST_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long custCustId;

    @NotNull(message = MESSAGE_TO_NULL_SSTAT_SSTAT_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long sstatSstatId;

    private String cancelReason;

    @NotNull(message = MESSAGE_TO_NULL_CNTR_CNTR_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long cntrCntrId;

}
