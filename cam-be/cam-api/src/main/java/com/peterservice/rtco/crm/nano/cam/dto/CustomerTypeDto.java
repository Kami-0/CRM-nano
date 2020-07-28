package com.peterservice.rtco.crm.nano.cam.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerTypeDto {
    private Long typeId;

    private String keyName;

    private String name;
}
