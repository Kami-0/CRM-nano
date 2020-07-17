package cam.service;

import cam.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAll();

    CustomerDto getById(Long id);

    CustomerDto getByName(String nameCustomer);

    CustomerDto create(CustomerDto customerDto);

    CustomerDto update(Long id, CustomerDto customerDto);

    void delete(Long id);
}
