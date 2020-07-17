package cam.personRepository;

import cam.domain.CustomerBankEntity;
import cam.domain.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBankRepository extends JpaRepository<CustomerBankEntity, Long> {
}
