package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.Bank;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatus;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerType;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface CamDictionaryApiFeign extends DictionaryApi{
    @RequestLine("GET /dictionary/banks")
    List<Bank> getAllBanks();

    @RequestLine("GET /dictionary/banks/{id}")
    Bank getBankById(@Param("id") Long id);

    @RequestLine("GET /dictionary/types")
    List<CustomerType> getAllCustomersType();

    @RequestLine("GET /dictionary/types/{id}")
    CustomerType getTypeById(@Param("id") Long id);

    @RequestLine("GET /dictionary/statuses")
    List<CustomerStatus> getAllCustomersStatus();

    @RequestLine("GET /dictionary/statuses/{id}")
    CustomerStatus getStatusById(@Param("id") Long id);
}
