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
@Table(name = "CUSTOMER_STATUS")
public class CustomerStatusEntity {
    @Id
    @Column(name = "STATUS_ID")
    private Long statusId;

    @Column(name = "KEY_NAME")
    private String keyName;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "status")
    private Set<CustomerEntity> customers; //Здесь не нужен
}