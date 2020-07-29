package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.CustomerDto;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface CamCustomerApiFeign extends CustomerApi {

    @RequestLine("GET /customers/{id}")
    CustomerDto getCustomerById(@Param("id") Long id);

    @RequestLine("GET /customers/name/{name}")
    CustomerDto getCustomerByName(@Param("name") String name);

    @RequestLine("GET /customers?limit={limit}&offset={offset}")
    List<CustomerDto> getAllCustomers(
            @Param("limit") Integer limit,
            @Param("offset") Integer offset);

    @RequestLine("POST /customers")
    @Headers("Content-Type: application/json")
    CustomerDto createCustomer(CustomerDto customerDto);

    @RequestLine("PUT /customers/{id}")
    @Headers("Content-Type: application/json")
    CustomerDto updateCustomer(@Param("id") Long id, CustomerDto customerDto);

    @RequestLine("DELETE /customers/{id}")
    void deleteCustomer(@Param("id") Long id);
}
