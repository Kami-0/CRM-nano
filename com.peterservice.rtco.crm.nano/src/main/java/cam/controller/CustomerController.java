package cam.controller;

import cam.dto.CustomerDto;
import cam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public CustomerDto getCustomerByName(@RequestParam(value = "name", required = true) String customerName) {
        return customerService.getByName(customerName);
    }

    @PostMapping
    public CustomerDto createCustomer(@RequestBody CustomerDto customerDto) {
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
