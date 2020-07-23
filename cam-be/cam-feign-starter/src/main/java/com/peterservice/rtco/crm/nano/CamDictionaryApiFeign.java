package com.peterservice.rtco.crm.nano;

import com.peterservice.rtco.crm.nano.dto.BankDto;
import com.peterservice.rtco.crm.nano.dto.CustomerStatusDto;
import com.peterservice.rtco.crm.nano.dto.CustomerTypeDto;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface CamDictionaryApiFeign {
    @RequestLine("GET /banks")
    List<BankDto> getAllBanks();

    @RequestLine("GET /banks/{id}")
    BankDto getBankById(@Param("id") Long id);

    @RequestLine("GET /types")
    List<CustomerTypeDto> getAllCustomersType();

    @RequestLine("GET /types/{id}")
    CustomerTypeDto getTypeById(@Param("id") Long id);

    @RequestLine("GET /statuses")
    List<CustomerStatusDto> getAllCustomersStatus();

    @RequestLine("GET /statuses/{id}")
    CustomerStatusDto getStatusById(@Param("id") Long id);
}
