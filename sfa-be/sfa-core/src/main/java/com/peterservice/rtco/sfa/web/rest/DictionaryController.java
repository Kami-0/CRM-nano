package com.peterservice.rtco.sfa.web.rest;

import com.peterservice.rtco.sfa.api.DictionaryApi;
import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;
import com.peterservice.rtco.sfa.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Daniil.Makarov
 */
@RestController
@Validated
@RequestMapping(value = "/dictionary")
public class DictionaryController implements DictionaryApi {

    @Autowired
    private DictionaryService dictionaryService;

    @Override
    @GetMapping(value = "/sale/statuses")
    public List<SaleStatusDto> getAllSaleStatuses() {
        return dictionaryService.getAllSaleStatuses();
    }

    @Override
    @GetMapping(value = "/sale/statuses/{id}")
    public SaleStatusDto getSaleStatusById(@PathVariable long id) {
        return dictionaryService.getSaleStatusById(id);
    }
}
