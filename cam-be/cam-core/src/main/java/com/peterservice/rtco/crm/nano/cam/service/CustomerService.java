package com.peterservice.rtco.crm.nano.cam.service;

import com.peterservice.rtco.crm.nano.cam.dto.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll(Integer limit, Integer offset);

    Customer getById(Long id);

    Customer getByName(String nameCustomer);

    Customer create(Customer customer);

    Customer update(Long id, Customer customer);

    void delete(Long id);
}
