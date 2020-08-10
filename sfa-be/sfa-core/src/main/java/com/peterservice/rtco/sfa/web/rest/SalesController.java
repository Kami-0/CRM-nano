package com.peterservice.rtco.sfa.web.rest;

import com.peterservice.rtco.sfa.api.SalesApi;
import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.api.dto.SalesCancellationDto;
import com.peterservice.rtco.sfa.api.dto.SalesCreationDto;
import com.peterservice.rtco.sfa.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping(value = "/{id}")
    public SaleDto getSaleById(@PathVariable long id) {
        return salesService.getSaleById(id);
    }

    @Override
    @PostMapping(value = "/create")
    public SaleDto createSale(@RequestBody SalesCreationDto salesCreationDto) {
        return salesService.createSale(salesCreationDto);
    }

    @Override
    @PutMapping(value = "/{id}/cancel")
    public SaleDto cancelSale(@RequestBody SalesCancellationDto salesCancellationDto, @PathVariable long id) {
        return salesService.cancelSale(salesCancellationDto, id);
    }

    @Override
    @PutMapping(value = "/{id}/close")
    public SaleDto closeSale(@PathVariable long id) {
        return salesService.closeSale(id);
    }

    @Override
    @DeleteMapping(value = "/{id}/delete")
    public void deleteSale(@PathVariable long id) {
        salesService.deleteSale(id);
    }
}
