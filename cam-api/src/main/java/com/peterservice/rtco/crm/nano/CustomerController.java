package com.peterservice.rtco.crm.nano;

import com.peterservice.rtco.crm.nano.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface CustomerController {
    @GetMapping
    List<CustomerDto> getAllCustomers(
            @RequestParam(defaultValue = "5") Integer limit,
            @RequestParam(defaultValue = "0") Integer offset);

    @GetMapping("/{id}")
    CustomerDto getCustomerById(@PathVariable(name = "id") Long id);

    @GetMapping("/name/{name}")
    CustomerDto getCustomerByName(@PathVariable(value = "name") String name);

    @PostMapping
    CustomerDto createCustomer(@Valid @RequestBody CustomerDto customerDto);

    @PutMapping
    CustomerDto updateCustomer(@RequestParam(value = "id", required = true) Long id, @RequestBody CustomerDto customerDto);
}
