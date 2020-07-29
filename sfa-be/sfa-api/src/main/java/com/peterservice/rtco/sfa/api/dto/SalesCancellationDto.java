package com.peterservice.rtco.sfa.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static com.peterservice.rtco.sfa.api.constans.DtoConstants.*;
import static com.peterservice.rtco.sfa.api.constans.StatusIdConstants.SALES_CANCEL_STATUS_ID;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@Data
@ToString
public class SalesCancellationDto {

    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long saleId;

    @NotNull(message = MESSAGE_TO_NULL_SSTAT_SSTAT_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long sstatSstatId = SALES_CANCEL_STATUS_ID;

    @NotBlank(message = MESSAGE_TO_NULL_CANCEL_REASON)
    private String cancelReason;

    public SalesCancellationDto(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long saleId, @NotBlank(message = MESSAGE_TO_NULL_CANCEL_REASON) String cancelReason) {
        this.saleId = saleId;
        this.cancelReason = cancelReason;
    }
}
