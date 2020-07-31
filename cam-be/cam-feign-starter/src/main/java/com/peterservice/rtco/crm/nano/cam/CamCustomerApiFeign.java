package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.Customer;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface CamCustomerApiFeign extends CustomerApi {

    @RequestLine("GET /customers/{id}")
    Customer getCustomerById(@Param("id") Long id);

    @RequestLine("GET /customers/name/{name}")
    Customer getCustomerByName(@Param("name") String name);

    @RequestLine("GET /customers?limit={limit}&offset={offset}")
    List<Customer> getAllCustomers(
            @Param("limit") Integer limit,
            @Param("offset") Integer offset);

    @RequestLine("POST /customers")
    @Headers("Content-Type: application/json")
    Customer createCustomer(Customer customer);

    @RequestLine("PUT /customers/{id}")
    @Headers("Content-Type: application/json")
    Customer updateCustomer(@Param("id") Long id, Customer customer);

    @RequestLine("DELETE /customers/{id}")
    void deleteCustomer(@Param("id") Long id);
}
