package com.peterservice.rtco.crm.nano.cam.repository;

import com.peterservice.rtco.crm.nano.cam.domain.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBankRepository extends JpaRepository<BankEntity, Long> {
}
