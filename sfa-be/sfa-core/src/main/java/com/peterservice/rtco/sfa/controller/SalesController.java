package com.peterservice.rtco.sfa.controller;

import com.peterservice.rtco.sfa.api.SalesApi;
import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Daniil.Makarov
 */
@RestController
@Validated
@RequestMapping(value = "/sales")
public class SalesController implements SalesApi {

    @Autowired
    private SalesService salesService;

    @Override
    public List<SaleDto> getAllSale(Integer limit, Integer offset) {
        return null;
    }

    @Override
    @GetMapping(value = "/{id}")
    public SaleDto getSaleById(@PathVariable long id) {
        return salesService.getSaleById(id);
    }

    @Override
    @PostMapping(value = "/create")
    public SaleDto createSale(@RequestBody SaleDto saleDto) {
        return salesService.createSale(saleDto);
    }

    @Override
    public SaleDto updateSale(SaleDto saleDto) {
        return null;
    }

    @Override
    public void deleteSale(long id) {

    }
}
