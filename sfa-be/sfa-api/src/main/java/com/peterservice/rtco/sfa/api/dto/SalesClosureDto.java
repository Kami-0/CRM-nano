package com.peterservice.rtco.sfa.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static com.peterservice.rtco.sfa.api.constans.DtoConstants.*;
import static com.peterservice.rtco.sfa.api.constans.StatusIdConstants.SALES_CLOSURE_STATUS_ID;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@Data
@ToString
public class SalesClosureDto {

    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long saleId;

    @NotNull(message = MESSAGE_TO_NULL_SSTAT_SSTAT_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private long sstatSstatId = SALES_CLOSURE_STATUS_ID;

    public SalesClosureDto(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long saleId) {
        this.saleId = saleId;
    }
}
