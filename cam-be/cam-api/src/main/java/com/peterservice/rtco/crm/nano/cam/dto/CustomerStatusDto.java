package com.peterservice.rtco.crm.nano.cam.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerStatusDto {
    private Long statusId;

    private String keyName;

    private String name;
}