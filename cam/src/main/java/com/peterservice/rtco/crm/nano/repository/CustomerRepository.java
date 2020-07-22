package com.peterservice.rtco.crm.nano.repository;

import com.peterservice.rtco.crm.nano.domain.CustomerEntity;
import com.peterservice.rtco.crm.nano.dto.CustomerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    CustomerEntity findByName(String name_customer);

    @Override
    Page<CustomerEntity> findAll(Pageable pageable);


}
