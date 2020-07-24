package com.peterservice.rtco.crm.nano.controller;

import com.peterservice.rtco.crm.nano.CustomerApi;
import com.peterservice.rtco.crm.nano.dto.CustomerDto;
import com.peterservice.rtco.crm.nano.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController implements CustomerApi {
    @Autowired
    private CustomerService customerService;

    @Override
    @GetMapping
    public List<CustomerDto> getAllCustomers(
            @RequestParam(defaultValue = "5") Integer limit,
            @RequestParam(defaultValue = "0") Integer offset) {
        return customerService.getAll(limit, offset);
    }

    @Override
    @GetMapping("/{id}")
    public CustomerDto getCustomerById(@PathVariable(name = "id") Long id) {
        return customerService.getById(id);
    }

    @Override
    @GetMapping("/name/{name}")
    public CustomerDto getCustomerByName(@PathVariable(value = "name") String name) {
        return customerService.getByName(name);
    }

    @Override
    @PostMapping
    public CustomerDto createCustomer(@Valid @RequestBody CustomerDto customerDto) {
        return customerService.create(customerDto);
    }

    @Override
    @PutMapping
    public CustomerDto updateCustomer(@RequestParam(value = "id", required = true) Long id, @RequestBody CustomerDto customerDto) {
        return customerService.update(id, customerDto);
    }

    @Override
    @DeleteMapping
    public void deleteCustomer(@RequestParam(value = "id", required = true) Long id) {
        customerService.delete(id);
    }
}
