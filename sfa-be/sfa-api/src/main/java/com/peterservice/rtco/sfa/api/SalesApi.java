package com.peterservice.rtco.sfa.api;

import com.peterservice.rtco.sfa.api.dto.SaleDto;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

public interface SalesApi {
    String MESSAGE_TO_NOT_VALID_ID = "Минимальный id сущности = 1";
    int ID_MIN = 1;

    List<SaleDto> getAllSale(Integer limit, Integer offset);

    SaleDto getSaleById(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);

    SaleDto createSale(@Valid SaleDto saleDto);

    SaleDto updateSale(SaleDto saleDto);

    void deleteSale(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);

}
