package com.peterservice.rtco.sfa.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static com.peterservice.rtco.sfa.api.constan.DtoConstants.*;
import static com.peterservice.rtco.sfa.api.constan.StatusIdConstants.SALES_CREATE_STATUS_ID;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@Data
@ToString
public class SalesCreationDto {

    @NotNull(message = MESSAGE_TO_NULL_CUST_CUST_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private Long custCustId;

    @NotNull(message = MESSAGE_TO_NULL_SSTAT_SSTAT_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private Long sstatSstatId = SALES_CREATE_STATUS_ID;


    @NotNull(message = MESSAGE_TO_NULL_CNTR_CNTR_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private Long cntrCntrId;

    public SalesCreationDto(@NotNull(message = MESSAGE_TO_NULL_CUST_CUST_ID) @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) Long custCustId,
                            @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) @NotNull(message = MESSAGE_TO_NULL_CNTR_CNTR_ID) Long cntrCntrId) {
        this.custCustId = custCustId;
        this.cntrCntrId = cntrCntrId;
    }
}
