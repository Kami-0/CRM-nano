package com.peterservice.rtco.crm.nano.cam.service;

import com.peterservice.rtco.crm.nano.cam.domain.CustomerEntity;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerDto;
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
    public List<CustomerDto> getAll(Integer limit, Integer offset) {
        Pageable paging = PageRequest.of(offset / limit, limit);
        Page<CustomerEntity> pageResult = customerRepository.findAll(paging);
        return pageResult
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
    public CustomerDto getByName(String name) {
        CustomerEntity customerEntity = customerRepository.findByName(name);
        if(customerEntity == null)
            throw new EntityNotFoundException("Failed to find customer with name: " + name);
        return entityToDto(customerEntity);
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
        customerEntity.setName(customerDto.getName());
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
                .name(customerEntity.getName())
                .inn(customerEntity.getInn())
                .kpp(customerEntity.getKpp())
                .typeTypeId(customerEntity.getType().getTypeId())
                .bankId(customerEntity.getBank().getBankId())
                .statusStatusId(customerEntity.getStatus().getStatusId())
                .build();
    }

    private CustomerEntity dtoToEntity(CustomerDto customerDto) {
        return CustomerEntity.builder()
                .name(customerDto.getName())
                .inn(customerDto.getInn())
                .kpp(customerDto.getKpp())
                .bank(customerBankRepository.getOne(customerDto.getBankId()))
                .status(customerStatusRepository.getOne(customerDto.getStatusStatusId()))
                .type(customerTypeRepository.getOne(customerDto.getTypeTypeId()))
                .build();
    }
}
