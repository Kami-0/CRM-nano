package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.Bank;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatus;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerType;

import java.util.List;

public interface DictionaryApi {

    List<Bank> getAllBanks();
    
    Bank getBankById(Long id);

    List<CustomerType> getAllCustomersType();

    CustomerType getTypeById(Long id);

    List<CustomerStatus> getAllCustomersStatus();

    CustomerStatus getStatusById(Long id);
}
