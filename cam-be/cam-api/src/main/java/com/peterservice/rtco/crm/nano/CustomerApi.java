package com.peterservice.rtco.crm.nano;

import com.peterservice.rtco.crm.nano.dto.CustomerDto;

import java.util.List;

public interface CustomerApi {
    CustomerDto getCustomerById(Long id);

    CustomerDto getCustomerByName(String name);
    
    List<CustomerDto> getAllCustomers(
            Integer limit,
            Integer offset);
    
    CustomerDto createCustomer(CustomerDto customerDto);
    
    CustomerDto updateCustomer(Long id, CustomerDto customerDto);
    
    void deleteCustomer(Long id);
}

