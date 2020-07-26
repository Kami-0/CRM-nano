package com.peterservice.rtco.sfa.controller;

import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;
import com.peterservice.rtco.sfa.service.DictionaryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Daniil.Makarov
 */
@RestController
@RequestMapping(value = "/dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryServiceImp dictionaryService;

    @GetMapping(value = "/sale/statuses")
    public List<SaleStatusDto> getAllSaleStatuses() {
        return dictionaryService.getAllSaleStatuses();
    }

    @GetMapping(value = "/sale/statuses/{id}")
    public SaleStatusDto getSaleStatusById(@PathVariable long id) {
        return dictionaryService.getSaleStatusById(id);
    }
}
