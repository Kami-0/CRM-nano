package com.peterservice.rtco.crm.nano.service;

import com.peterservice.rtco.crm.nano.domain.CustomerEntity;
import com.peterservice.rtco.crm.nano.dto.CustomerDto;
import com.peterservice.rtco.crm.nano.repository.CustomerBankRepository;
import com.peterservice.rtco.crm.nano.repository.CustomerRepository;
import com.peterservice.rtco.crm.nano.repository.CustomerStatusRepository;
import com.peterservice.rtco.crm.nano.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CustomerServiceImp implements CustomerService {
    //   protected static Logger logger = Logger.getLogger("service");
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
    public List<CustomerDto> getAll() {
        return customerRepository
                .findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public CustomerDto getById(Long id) {
        return entityToDto(customerRepository.getOne(id));
    }

    @Transactional
    @Override
    public CustomerDto getByName(String customerName) {
        return entityToDto(customerRepository.findByNameCustomer(customerName));
    }

    @Transactional
    @Override
    public CustomerDto create(CustomerDto customerDto) {
        CustomerEntity result = customerRepository.save(dtoToEntity(customerDto));
        return entityToDto(result);
    }

    @Transactional
    @Override
    public CustomerDto update(Long id, CustomerDto customerDto) {
        CustomerEntity customerEntity = customerRepository.getOne(id);
        customerEntity.setId(id);
        customerEntity.setNameCustomer(customerDto.getNameCustomer());
        customerEntity.setInn(customerDto.getInn());
        customerEntity.setKpp(customerDto.getKpp());
        customerEntity.setBank(customerBankRepository.getOne(customerDto.getBankId()));
        customerEntity.setStatus(customerStatusRepository.getOne(customerDto.getStatusStatusId()));
        customerEntity.setType(customerTypeRepository.getOne(customerDto.getTypeTypeId()));
        CustomerEntity result = customerRepository.save(customerEntity);
        return entityToDto(result);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    private CustomerDto entityToDto(CustomerEntity customerEntity) {
        return CustomerDto.builder()
                .id(customerEntity.getId())
                .nameCustomer(customerEntity.getNameCustomer())
                .inn(customerEntity.getInn())
                .kpp(customerEntity.getKpp())
                .typeTypeId(customerEntity.getType().getTypeId())
                .bankId(customerEntity.getBank().getBankId())
                .statusStatusId(customerEntity.getStatus().getStatusId())
                .build();
    }

    private CustomerEntity dtoToEntity(CustomerDto customerDto) {
        return CustomerEntity.builder()
                .nameCustomer(customerDto.getNameCustomer())
                .inn(customerDto.getInn())
                .kpp(customerDto.getKpp())
                .bank(customerBankRepository.getOne(customerDto.getBankId()))
                .status(customerStatusRepository.getOne(customerDto.getStatusStatusId()))
                .type(customerTypeRepository.getOne(customerDto.getTypeTypeId()))
                .build();
    }
}
