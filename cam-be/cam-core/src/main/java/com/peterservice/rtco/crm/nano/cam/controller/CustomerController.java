package com.peterservice.rtco.crm.nano.cam.controller;

import com.peterservice.rtco.crm.nano.cam.CustomerApi;
import com.peterservice.rtco.crm.nano.cam.dto.Customer;
import com.peterservice.rtco.crm.nano.cam.service.CustomerService;
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
    public List<Customer> getAllCustomers(
            @RequestParam(defaultValue = "5") Integer limit,
            @RequestParam(defaultValue = "0") Integer offset) {
        return customerService.getAll(limit, offset);
    }

    @Override
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable(name = "id") Long id) {
        return customerService.getById(id);
    }

    @Override
    @GetMapping("/name/{name}")
    public Customer getCustomerByName(@PathVariable(value = "name") String name) {
        return customerService.getByName(name);
    }

    @Override
    @PostMapping
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @Override
    @PutMapping
    public Customer updateCustomer(@RequestParam(value = "id", required = true) Long id, @RequestBody Customer customer) {
        return customerService.update(id, customer);
    }

    @Override
    @DeleteMapping
    public void deleteCustomer(@RequestParam(value = "id", required = true) Long id) {
        customerService.delete(id);
    }
}
