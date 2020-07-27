package com.peterservice.rtco.sfa.api;

import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;

import java.util.List;

public interface DictionaryApi {

    List<SaleStatusDto> getAllSaleStatuses();

    SaleStatusDto getSaleStatusById(long id);
}
