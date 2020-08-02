package com.peterservice.rtco.sfa.api.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static com.peterservice.rtco.sfa.api.constan.DtoConstants.*;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class SalesCreationDto implements DtoInterface {
    @NotNull(message = MESSAGE_TO_NULL_CUST_CUST_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private Long custCustId;

    @NotNull(message = MESSAGE_TO_NULL_CNTR_CNTR_ID)
    @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID)
    private Long cntrCntrId;
}
