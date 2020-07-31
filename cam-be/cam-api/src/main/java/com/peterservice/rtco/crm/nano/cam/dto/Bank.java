package com.peterservice.rtco.crm.nano.cam.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bank {
    
    private Long bankId;

    private String name;
    
    private String address;

    private String corrAccount;

    private Long bik;

    private Long inn;

    private Long kpp;

    private Date startDate;

    private Date endDate;

    private Date lastChgDate;
    
}