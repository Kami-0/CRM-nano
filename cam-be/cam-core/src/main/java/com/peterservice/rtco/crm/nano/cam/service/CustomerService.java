package com.peterservice.rtco.crm.nano.cam.service;

import com.peterservice.rtco.crm.nano.cam.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAll(Integer limit, Integer offset);

    CustomerDto getById(Long id);

    CustomerDto getByName(String nameCustomer);

    CustomerDto create(CustomerDto customerDto);

    CustomerDto update(Long id, CustomerDto customerDto);

    void delete(Long id);
}