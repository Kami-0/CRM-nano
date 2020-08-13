package com.peterservice.rtco.sfa.feign;

import com.peterservice.rtco.sfa.api.DictionaryApi;
import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;
import feign.Param;
import feign.RequestLine;

import javax.validation.constraints.Min;
import java.util.List;

import static com.peterservice.rtco.sfa.api.constan.ApiConstants.ID_MIN;
import static com.peterservice.rtco.sfa.api.constan.ApiConstants.MESSAGE_TO_NOT_VALID_ID;

/**
 * @author Daniil.Makarov
 */
public interface DictionaryApiFeign extends DictionaryApi {
    @RequestLine("GET /dictionary/sale/statuses")
    List<SaleStatusDto> getAllSaleStatuses();

    @RequestLine("GET /dictionary/sale/statuses/{id}")
    SaleStatusDto getSaleStatusById(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) @Param("id") long id);
}
