package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.BankDto;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatusDto;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerTypeDto;

import java.util.List;

public interface DictionaryApi {

    List<BankDto> getAllBanks();
    
    BankDto getBankById(Long id);

    List<CustomerTypeDto> getAllCustomersType();

    CustomerTypeDto getTypeById(Long id);

    List<CustomerStatusDto> getAllCustomersStatus();

    CustomerStatusDto getStatusById(Long id);
}
