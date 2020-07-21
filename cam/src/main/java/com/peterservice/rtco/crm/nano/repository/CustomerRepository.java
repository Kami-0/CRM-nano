package com.peterservice.rtco.crm.nano.repository;

import com.peterservice.rtco.crm.nano.domain.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    CustomerEntity findByNameCustomer(String name_customer);

}
