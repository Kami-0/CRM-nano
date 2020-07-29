package com.peterservice.rtco.sfa.api;

import com.peterservice.rtco.sfa.api.dto.SaleDto;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

import static com.peterservice.rtco.sfa.api.constans.ApiConstants.ID_MIN;
import static com.peterservice.rtco.sfa.api.constans.ApiConstants.MESSAGE_TO_NOT_VALID_ID;

public interface SalesApi {

    List<SaleDto> getAllSale(Integer limit, Integer offset);

    SaleDto getSaleById(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);

    SaleDto createSale(@Valid SaleDto saleDto);

    SaleDto updateSale(SaleDto saleDto);

    void deleteSale(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);

}
