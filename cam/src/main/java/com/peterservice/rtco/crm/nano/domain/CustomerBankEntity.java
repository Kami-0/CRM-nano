package com.peterservice.rtco.crm.nano.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "BANK")
public class CustomerBankEntity {
    @Id
    @Column(name = "BANK_ID")
    private Long bankId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CORR_ACCOUNT")
    private String corrAccount;

    @Column(name = "BIK")
    private Long bik;

    @Column(name = "INN")
    private Long inn;

    @Column(name = "KPP")
    private Long kpp;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "LAST_CHG_DATE")
    private Date lastChgDate;


}