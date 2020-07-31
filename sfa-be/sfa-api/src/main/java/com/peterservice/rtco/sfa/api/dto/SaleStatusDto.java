package com.peterservice.rtco.sfa.api.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
@EqualsAndHashCode
public class SaleStatusDto {
    @NotNull
    private long sstatId;
    @NotBlank
    private String keyName;
    @NotBlank
    private String name;
    @NotNull
    private boolean isActiveYn;
}
