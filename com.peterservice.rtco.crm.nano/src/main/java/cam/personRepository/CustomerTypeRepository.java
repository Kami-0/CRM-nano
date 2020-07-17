package cam.personRepository;

import cam.domain.CustomerTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerTypeEntity, Long> {
}