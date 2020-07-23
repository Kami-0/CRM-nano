package com.peterservice.rtco.crm.nano;

import com.peterservice.rtco.crm.nano.dto.CustomerDto;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface CustomerApi {
    @RequestLine("GET /customers/{id}")
    CustomerDto getCustomerById(@Param("id")Long id);

    @RequestLine("GET /customers/name/{name}")
    CustomerDto getCustomerByName(@Param("name") String name);

    @RequestLine("GET /customers?limit={limit}&offset={offset}")
    List<CustomerDto> getAllCustomers(
            @Param("limit") Integer limit,
            @Param("offset") Integer offset);

    @RequestLine("POST /customers")
    CustomerDto createCustomer(CustomerDto customerDto);

    @RequestLine("PUT /customers/{id}")
    CustomerDto updateCustomer(@Param("id") Long id, CustomerDto customerDto);

    @RequestLine("DELETE /customers/{id}")
    void deleteCustomer(@Param("id") Long id);
}

