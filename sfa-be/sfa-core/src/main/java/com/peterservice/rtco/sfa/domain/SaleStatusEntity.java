package com.peterservice.rtco.sfa.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Daniil.Makarov
 */
@Entity
@Table(name = "sale_status")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class SaleStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sstat_id")
    private long sstatId;

    @Column(name = "key_name", nullable = false)
    private String keyName;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "is_active_yn")
    private boolean isActiveYn;

    @Override
    public String toString() {
        return String.format(
                "SaleStatus[sstatId=%d, keyName='%s', name='%s', isActiveYn='%b']",
                sstatId, keyName, name, isActiveYn);
    }
}
