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
@Table(name = "CUSTOMER_BANK")
public class CustomerBankEntity {
    @Id
    @Column(name = "BANK_ID")
    private Long bankId;

//    @Column(name = "KEY_NAME")
//    private String keyName;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "bank")
    private Set<CustomerEntity> customers;
}