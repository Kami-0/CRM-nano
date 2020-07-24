package com.peterservice.rtco.crm.nano.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "CUSTOMER_STATUS")
public class CustomerStatusEntity {
    @Id
    @Column(name = "STATUS_ID")
    private Long statusId;

    @Column(name = "KEY_NAME")
    private String keyName;

    @Column(name = "NAME")
    private String name;

}