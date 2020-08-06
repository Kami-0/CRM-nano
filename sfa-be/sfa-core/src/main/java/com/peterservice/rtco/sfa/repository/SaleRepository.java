package com.peterservice.rtco.sfa.repository;

import com.peterservice.rtco.sfa.domain.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Long> {
}