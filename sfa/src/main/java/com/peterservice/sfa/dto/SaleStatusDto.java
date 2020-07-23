package com.peterservice.sfa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SaleStatusDto {
    private long sstatId;
    private String keyName;
    private String name;
    private boolean isActiveYn;

    @Override
    public String toString() {
        return String.format(
                "SaleStatusDto[sstatId=%d, keyName='%s', name='%s', isActiveYn='%b']",
                sstatId, keyName, name, isActiveYn);
    }
}
