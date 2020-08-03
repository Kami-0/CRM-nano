package com.peterservice.rtco.sfa.api.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

import static com.peterservice.rtco.sfa.api.constan.DtoConstants.MESSAGE_TO_NULL_CANCEL_REASON;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class SalesCancellationDto {
    @NotBlank(message = MESSAGE_TO_NULL_CANCEL_REASON)
    private String cancelReason;
}
