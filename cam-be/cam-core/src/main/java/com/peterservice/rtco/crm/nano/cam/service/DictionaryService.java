package com.peterservice.rtco.crm.nano.cam.service;

import com.peterservice.rtco.crm.nano.cam.dto.BankDto;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatusDto;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerTypeDto;

import java.util.List;

public interface DictionaryService {
    List<CustomerTypeDto> getAllTypes();

    List<CustomerStatusDto> getAllStatuses();

    List<BankDto> getAllBanks();

    CustomerTypeDto getTypeById(Long id);

    CustomerStatusDto getStatusById(Long id);

    BankDto getBankById(Long id);
}
