package com.peterservice.rtco.crm.nano.cam.repository;

import com.peterservice.rtco.crm.nano.cam.domain.CustomerTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerTypeEntity, Long> {
}