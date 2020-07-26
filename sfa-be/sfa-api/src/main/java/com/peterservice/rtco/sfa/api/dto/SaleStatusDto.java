package com.peterservice.rtco.sfa.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Daniil.Makarov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
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
