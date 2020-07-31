package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.Customer;

import java.util.List;

public interface CustomerApi {
    Customer getCustomerById(Long id);

    Customer getCustomerByName(String name);
    
    List<Customer> getAllCustomers(
            Integer limit,
            Integer offset);
    
    Customer createCustomer(Customer customer);
    
    Customer updateCustomer(Long id, Customer customer);
    
    void deleteCustomer(Long id);
}

