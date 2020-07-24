package com.peterservice.rtco.crm.nano;

import com.peterservice.rtco.crm.nano.dto.BankDto;
import com.peterservice.rtco.crm.nano.dto.CustomerStatusDto;
import com.peterservice.rtco.crm.nano.dto.CustomerTypeDto;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface DictionaryApi {

    List<BankDto> getAllBanks();
    
    BankDto getBankById(Long id);

    List<CustomerTypeDto> getAllCustomersType();

    CustomerTypeDto getTypeById(Long id);

    List<CustomerStatusDto> getAllCustomersStatus();

    CustomerStatusDto getStatusById(Long id);
}
