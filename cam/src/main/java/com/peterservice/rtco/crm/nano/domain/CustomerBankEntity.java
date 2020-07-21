package com.peterservice.rtco.crm.nano.domain;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "CUSTOMER_BANK")
public class CustomerBankEntity {
    @Id
    @Column(name = "BANK_ID")
    private Long bankId;

    @Column(name = "KEY_NAME")
    private String keyName;

    @Column(name = "NAME")
    private String name;


}