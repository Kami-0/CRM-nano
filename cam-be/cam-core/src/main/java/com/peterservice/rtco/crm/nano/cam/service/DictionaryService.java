package com.peterservice.rtco.crm.nano.cam.service;

import com.peterservice.rtco.crm.nano.cam.dto.Bank;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatus;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerType;

import java.util.List;

public interface DictionaryService {
    List<CustomerType> getAllTypes();

    List<CustomerStatus> getAllStatuses();

    List<Bank> getAllBanks();

    CustomerType getTypeById(Long id);

    CustomerStatus getStatusById(Long id);

    Bank getBankById(Long id);
}
