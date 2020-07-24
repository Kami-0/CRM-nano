package com.peterservice.rtco.crm.nano.service;

import com.peterservice.rtco.crm.nano.domain.BankEntity;
import com.peterservice.rtco.crm.nano.domain.CustomerStatusEntity;
import com.peterservice.rtco.crm.nano.domain.CustomerTypeEntity;
import com.peterservice.rtco.crm.nano.dto.BankDto;
import com.peterservice.rtco.crm.nano.dto.CustomerStatusDto;
import com.peterservice.rtco.crm.nano.dto.CustomerTypeDto;
import com.peterservice.rtco.crm.nano.repository.CustomerBankRepository;
import com.peterservice.rtco.crm.nano.repository.CustomerStatusRepository;
import com.peterservice.rtco.crm.nano.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DictionaryServiceImp implements DictionaryService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Autowired
    private CustomerBankRepository customerBankRepository;

    @Autowired
    private CustomerStatusRepository customerStatusRepository;

    @Override
    public List<CustomerTypeDto> getAllTypes() {
        return customerTypeRepository
                .findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<CustomerStatusDto> getAllStatuses() {
        return customerStatusRepository
                .findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<BankDto> getAllBanks() {
        return customerBankRepository
                .findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerTypeDto getTypeById(Long id) {
        return entityToDto(customerTypeRepository.getOne(id));
    }

    @Override
    public CustomerStatusDto getStatusById(Long id) {
        return entityToDto(customerStatusRepository.getOne(id));
    }

    @Override
    public BankDto getBankById(Long id) {
        return entityToDto(customerBankRepository.getOne(id));
    }

    private CustomerTypeDto entityToDto(CustomerTypeEntity customerTypeEntity) {
        return CustomerTypeDto.builder()
                .typeId(customerTypeEntity.getTypeId())
                .keyName(customerTypeEntity.getKeyName())
                .name(customerTypeEntity.getName())
                .build();
    }

    private CustomerStatusDto entityToDto(CustomerStatusEntity customerStatusEntity) {
        return CustomerStatusDto.builder()
                .statusId(customerStatusEntity.getStatusId())
                .keyName(customerStatusEntity.getKeyName())
                .name(customerStatusEntity.getName())
                .build();
    }

    private BankDto entityToDto(BankEntity customerBankEntity) {
        return BankDto.builder()
                .bankId(customerBankEntity.getBankId())
                .name(customerBankEntity.getName())
                .address(customerBankEntity.getAddress())
                .corrAccount(customerBankEntity.getCorrAccount())
                .bik(customerBankEntity.getBik())
                .inn(customerBankEntity.getInn())
                .kpp(customerBankEntity.getKpp())
                .startDate(customerBankEntity.getStartDate())
                .endDate(customerBankEntity.getEndDate())
                .lastChgDate(customerBankEntity.getLastChgDate())
                .build();
    }
}
