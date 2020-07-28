package com.peterservice.rtco.sfa.api;

import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;

import javax.validation.constraints.Min;
import java.util.List;

public interface DictionaryApi {
    String MESSAGE_TO_NOT_VALID_ID = "Минимальный id сущности = 1";
    int ID_MIN = 1;

    List<SaleStatusDto> getAllSaleStatuses();

    SaleStatusDto getSaleStatusById(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);
}
