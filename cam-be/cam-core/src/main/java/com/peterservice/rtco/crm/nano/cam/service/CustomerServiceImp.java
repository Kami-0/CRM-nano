package com.peterservice.rtco.crm.nano.cam.service;

import com.peterservice.rtco.crm.nano.cam.domain.CustomerEntity;
import com.peterservice.rtco.crm.nano.cam.dto.Customer;
import com.peterservice.rtco.crm.nano.cam.repository.CustomerRepository;
import com.peterservice.rtco.crm.nano.cam.repository.CustomerBankRepository;
import com.peterservice.rtco.crm.nano.cam.repository.CustomerStatusRepository;
import com.peterservice.rtco.crm.nano.cam.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Autowired
    private CustomerBankRepository customerBankRepository;

    @Autowired
    private CustomerStatusRepository customerStatusRepository;

    @Transactional
    @Override
    public List<Customer> getAll(Integer limit, Integer offset) {
        Pageable paging = PageRequest.of(offset / limit, limit);
        Page<CustomerEntity> pageResult = customerRepository.findAll(paging);
        return pageResult
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public Customer getById(Long id) {
        return entityToDto(customerRepository.getOne(id));
    }

    @Transactional
    @Override
    public Customer getByName(String name) {
        CustomerEntity customerEntity = customerRepository.findByName(name);
        if(customerEntity == null)
            throw new EntityNotFoundException("Failed to find customer with name: " + name);
        return entityToDto(customerEntity);
    }

    @Transactional
    @Override
    public Customer create(Customer customer) {
        CustomerEntity result = customerRepository.save(dtoToEntity(customer));
        return entityToDto(result);
    }

    @Transactional
    @Override
    public Customer update(Long id, Customer customer) {
        CustomerEntity customerEntity = customerRepository.getOne(id);
        customerEntity.setId(id);
        customerEntity.setName(customer.getName());
        customerEntity.setInn(customer.getInn());
        customerEntity.setKpp(customer.getKpp());
        customerEntity.setBank(customerBankRepository.getOne(customer.getBankId()));
        customerEntity.setStatus(customerStatusRepository.getOne(customer.getStatusStatusId()));
        customerEntity.setType(customerTypeRepository.getOne(customer.getTypeTypeId()));
        CustomerEntity result = customerRepository.save(customerEntity);
        return entityToDto(result);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    private Customer entityToDto(CustomerEntity customerEntity) {
        return Customer.builder()
                .id(customerEntity.getId())
                .name(customerEntity.getName())
                .inn(customerEntity.getInn())
                .kpp(customerEntity.getKpp())
                .typeTypeId(customerEntity.getType().getTypeId())
                .bankId(customerEntity.getBank().getBankId())
                .statusStatusId(customerEntity.getStatus().getStatusId())
                .build();
    }

    private CustomerEntity dtoToEntity(Customer customer) {
        return CustomerEntity.builder()
                .name(customer.getName())
                .inn(customer.getInn())
                .kpp(customer.getKpp())
                .bank(customerBankRepository.getOne(customer.getBankId()))
                .status(customerStatusRepository.getOne(customer.getStatusStatusId()))
                .type(customerTypeRepository.getOne(customer.getTypeTypeId()))
                .build();
    }
}
