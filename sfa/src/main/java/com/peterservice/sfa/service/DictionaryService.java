package com.peterservice.sfa.service;

import com.peterservice.sfa.dto.SaleStatusDto;

import java.util.List;

public interface DictionaryService {

    List<SaleStatusDto> getAllSaleStatuses();

    SaleStatusDto getSaleStatusById(Long id);

}
