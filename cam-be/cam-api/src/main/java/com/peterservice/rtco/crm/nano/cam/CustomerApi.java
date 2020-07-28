package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.CustomerDto;

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

