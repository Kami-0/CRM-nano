package com.peterservice.rtco.sfa.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SaleStatusDto {
    @NotNull
    private long sstatId;
    @NotEmpty
    private String keyName;
    @NotEmpty
    private String name;
    @NotNull
    private boolean isActiveYn;
}
