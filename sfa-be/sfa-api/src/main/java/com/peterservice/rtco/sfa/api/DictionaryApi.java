package com.peterservice.rtco.sfa.api;

import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;

import javax.validation.constraints.Min;
import java.util.List;

import static com.peterservice.rtco.sfa.api.constans.ApiConstants.ID_MIN;
import static com.peterservice.rtco.sfa.api.constans.ApiConstants.MESSAGE_TO_NOT_VALID_ID;

public interface DictionaryApi {

    List<SaleStatusDto> getAllSaleStatuses();

    SaleStatusDto getSaleStatusById(@Min(value = ID_MIN, message = MESSAGE_TO_NOT_VALID_ID) long id);
}
