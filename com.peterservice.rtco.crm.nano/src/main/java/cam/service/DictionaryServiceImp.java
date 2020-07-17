package cam.service;

import cam.domain.CustomerBankEntity;
import cam.domain.CustomerStatusEntity;
import cam.domain.CustomerTypeEntity;
import cam.dto.CustomerBankDto;
import cam.dto.CustomerStatusDto;
import cam.dto.CustomerTypeDto;
import cam.personRepository.CustomerBankRepository;
import cam.personRepository.CustomerStatusRepository;
import cam.personRepository.CustomerTypeRepository;
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
    public List<CustomerBankDto> getAllBanks() {
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
    public CustomerBankDto getBankById(Long id) {
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

    private CustomerBankDto entityToDto(CustomerBankEntity customerBankEntity) {
        return CustomerBankDto.builder()
                .bankId(customerBankEntity.getBankId())
                .name(customerBankEntity.getName())
                .build();
    }
}