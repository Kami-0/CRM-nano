package com.peterservice.rtco.sfa.feign;

import com.peterservice.rtco.sfa.api.SalesApi;
import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.api.dto.SalesCancellationDto;
import com.peterservice.rtco.sfa.api.dto.SalesCreationDto;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import static com.peterservice.rtco.sfa.api.constan.ApiConstants.ID_MIN;
import static com.peterservice.rtco.sfa.api.constan.ApiConstants.MESSAGE_TO_NOT_VALID_ID;

public interface SalesApiFeign extends SalesApi {
    @RequestLine("GET /sales/{id}")
    SaleDto getSaleById(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) @Param("id") long id);

    @RequestLine("POST /sales/create")
    @Headers("Content-Type: application/json")
    SaleDto createSale(@Valid SalesCreationDto salesCreationDto);

    @RequestLine("PUT /sales/{id}/cancel")
    @Headers("Content-Type: application/json")
    SaleDto cancelSale(@Valid SalesCancellationDto salesCancellationDto,
                       @Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) @Param("id") long id);

    @RequestLine("PUT /sales/{id}/close")
    @Headers("Content-Type: application/json")
    SaleDto closeSale(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) @Param("id") long id);

    @RequestLine("DELETE /sales/{id}/delete")
    void deleteSale(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) @Param("id") long id);

}
