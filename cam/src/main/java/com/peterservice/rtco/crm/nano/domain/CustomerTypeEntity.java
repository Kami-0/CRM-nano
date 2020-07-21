package com.peterservice.rtco.crm.nano.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "CUSTOMER_TYPES")
public class CustomerTypeEntity {
    @Id
    @Column(name = "TYPE_ID")
    private Long typeId;

    @Column(name = "KEY_NAME")
    private String keyName;

    @Column(name = "NAME")
    private String name;

}
