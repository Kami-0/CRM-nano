package com.peterservice.sfa.repository;

import com.peterservice.sfa.domain.SaleStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleStatusRepository extends JpaRepository<SaleStatusEntity, Long> {
}