package com.peterservice.rtco.crm.nano.cam.service;

import com.peterservice.rtco.crm.nano.cam.domain.BankEntity;
import com.peterservice.rtco.crm.nano.cam.domain.CustomerStatusEntity;
import com.peterservice.rtco.crm.nano.cam.domain.CustomerTypeEntity;
import com.peterservice.rtco.crm.nano.cam.dto.Bank;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatus;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerType;
import com.peterservice.rtco.crm.nano.cam.repository.CustomerBankRepository;
import com.peterservice.rtco.crm.nano.cam.repository.CustomerStatusRepository;
import com.peterservice.rtco.crm.nano.cam.repository.CustomerTypeRepository;
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
    public List<CustomerType> getAllTypes() {
        return customerTypeRepository
                .findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<CustomerStatus> getAllStatuses() {
        return customerStatusRepository
                .findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Bank> getAllBanks() {
        return customerBankRepository
                .findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerType getTypeById(Long id) {
        return entityToDto(customerTypeRepository.getOne(id));
    }

    @Override
    public CustomerStatus getStatusById(Long id) {
        return entityToDto(customerStatusRepository.getOne(id));
    }

    @Override
    public Bank getBankById(Long id) {
        return entityToDto(customerBankRepository.getOne(id));
    }

    private CustomerType entityToDto(CustomerTypeEntity customerTypeEntity) {
        return CustomerType.builder()
                .typeId(customerTypeEntity.getTypeId())
                .keyName(customerTypeEntity.getKeyName())
                .name(customerTypeEntity.getName())
                .build();
    }

    private CustomerStatus entityToDto(CustomerStatusEntity customerStatusEntity) {
        return CustomerStatus.builder()
                .statusId(customerStatusEntity.getStatusId())
                .keyName(customerStatusEntity.getKeyName())
                .name(customerStatusEntity.getName())
                .build();
    }

    private Bank entityToDto(BankEntity customerBankEntity) {
        return Bank.builder()
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
