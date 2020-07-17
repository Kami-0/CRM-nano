package cam.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(mappedBy = "type")
    private Set<CustomerEntity> customers;
}
