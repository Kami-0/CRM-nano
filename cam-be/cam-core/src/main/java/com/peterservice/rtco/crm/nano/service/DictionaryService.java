package com.peterservice.rtco.crm.nano.service;

import com.peterservice.rtco.crm.nano.dto.BankDto;
import com.peterservice.rtco.crm.nano.dto.CustomerStatusDto;
import com.peterservice.rtco.crm.nano.dto.CustomerTypeDto;

import java.util.List;

public interface DictionaryService {
    List<CustomerTypeDto> getAllTypes();

    List<CustomerStatusDto> getAllStatuses();

    List<BankDto> getAllBanks();

    CustomerTypeDto getTypeById(Long id);

    CustomerStatusDto getStatusById(Long id);

    BankDto getBankById(Long id);
}
