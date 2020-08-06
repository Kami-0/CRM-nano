package com.peterservice.rtco.sfa.domain;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

/**
 * @author Daniil.Makarov
 */
@Entity
@Table(name = "sale")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Long saleId;

    @Column(name = "sale_start_date")
    private Instant saleStartDate;

    @Column(name = "sale_end_date")
    private Instant saleEndDate;

    @Column(name = "cust_cust_id")
    private Long custCustId;

    @ManyToOne
    @JoinColumn(name = "sstat_sstat_id")
    private SaleStatusEntity sstatSstatId;

    @Column(name = "cancel_reason")
    private String cancelReason;

    @Column(name = "cntr_cntr_id")
    private Long cntrCntrId;
}
