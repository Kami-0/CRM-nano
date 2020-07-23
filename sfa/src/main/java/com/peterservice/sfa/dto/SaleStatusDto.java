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
    private long sstat_id;
    private String key_name;
    private String name;
    private boolean is_active_yn;
}
