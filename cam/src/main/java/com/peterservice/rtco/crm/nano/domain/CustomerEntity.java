package com.peterservice.rtco.crm.nano.domain;

import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "CUSTOMERS")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "TYPE_TYPE_ID", nullable = false)
    private CustomerTypeEntity type;

    @ManyToOne
    @JoinColumn(name = "STATUS_STATUS_ID", nullable = false)
    private CustomerStatusEntity status;

    @Column(name = "NAME_CUSTOMER")
    private String nameCustomer;

    @Column(name = "INN")
    private Long inn;

    @Column(name = "KPP")
    private Long kpp;

    @ManyToOne
    @JoinColumn(name = "BANK_ID", nullable = false)
    private CustomerBankEntity bank;
}
