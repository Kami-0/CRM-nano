package com.peterservice.sfa.controller;

import com.peterservice.sfa.dto.SaleStatusDto;
import com.peterservice.sfa.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    private DictionaryService dictionaryService;

    @GetMapping(value = "/sale-status")
    public List<SaleStatusDto> getAllSaleStatuses() {
        return dictionaryService.getAllSaleStatuses();
    }
}
