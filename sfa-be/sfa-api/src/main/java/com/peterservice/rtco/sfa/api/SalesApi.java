package com.peterservice.rtco.sfa.api;

import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.api.dto.SalesCancellationDto;
import com.peterservice.rtco.sfa.api.dto.SalesCreationDto;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import static com.peterservice.rtco.sfa.api.constan.ApiConstants.ID_MIN;
import static com.peterservice.rtco.sfa.api.constan.ApiConstants.MESSAGE_TO_NOT_VALID_ID;

public interface SalesApi {

    SaleDto getSaleById(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);

    SaleDto createSale(@Valid SalesCreationDto salesCreationDto);

    SaleDto cancelSale(@Valid SalesCancellationDto salesCancellationDto,
                       @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);

    SaleDto closeSale(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);

    void deleteSale(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);

}
