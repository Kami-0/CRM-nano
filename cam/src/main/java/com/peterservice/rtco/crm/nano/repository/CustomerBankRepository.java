package com.peterservice.rtco.crm.nano.repository;

import com.peterservice.rtco.crm.nano.domain.CustomerBankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBankRepository extends JpaRepository<CustomerBankEntity, Long> {
}
