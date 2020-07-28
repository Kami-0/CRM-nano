package com.peterservice.rtco.sfa.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private long saleId;

    @Column(name = "sale_start_date")
    private Instant saleStartDate;

    @Column(name = "sale_end_date")
    private Instant saleEndDate;

    @Column(name = "cust_cust_id")
    private long custCustId;

    @ManyToOne
    @JoinColumn(name = "sstat_sstat_id")
    private SaleStatusEntity sstatSstatId;

    @Column(name = "cancel_reason", nullable = false)
    private String cancelReason;

    @Column(name = "cntr_cntr_id")
    private long cntrCntrId;

    @Override
    public String toString() {
        return String.format(
                "Sale[saleId='%d', saleStartDate='%s', " +
                        "saleEndDate='%s', custCustId='%d', " +
                        "sstatSstatId='%d', sstatSstatId='%d', " +
                        "cancelReason='%s', cntrCntrId='%d']",
                saleId, saleStartDate, saleEndDate, custCustId,
                sstatSstatId, sstatSstatId, cancelReason, cntrCntrId);
    }
}
