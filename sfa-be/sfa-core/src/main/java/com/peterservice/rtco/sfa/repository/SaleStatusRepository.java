package com.peterservice.rtco.sfa.repository;

import com.peterservice.rtco.sfa.domain.SaleStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleStatusRepository extends JpaRepository<SaleStatusEntity, Long> {
}