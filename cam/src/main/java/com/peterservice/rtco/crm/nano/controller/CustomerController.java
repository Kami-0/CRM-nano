package com.peterservice.rtco.crm.nano.controller;

import com.peterservice.rtco.crm.nano.dto.CustomerDto;
import com.peterservice.rtco.crm.nano.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public List<CustomerDto> getAllCustomers() {
        return customerService.getAll();
    }

    @GetMapping
    public CustomerDto getCustomerById(@RequestParam(value = "id", required = true) Long id) {
        return customerService.getById(id);
    }

    @GetMapping("/getByName")
    public CustomerDto getCustomerByName(@RequestParam(value = "name", required = true) String name) {
        return customerService.getByName(name);
    }

    @PostMapping
    public CustomerDto createCustomer(@Valid @RequestBody CustomerDto customerDto) {
        return customerService.create(customerDto);
    }

    @PutMapping
    public CustomerDto updateCustomer(@RequestParam(value = "id", required = true) Long id, @RequestBody CustomerDto customerDto) {
        return customerService.update(id, customerDto);
    }

    @DeleteMapping
    private void deleteCustomer(@RequestParam(value = "id", required = true) Long id) {
        customerService.delete(id);
    }
}
