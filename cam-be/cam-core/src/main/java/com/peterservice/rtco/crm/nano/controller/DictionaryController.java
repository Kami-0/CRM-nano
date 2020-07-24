package com.peterservice.rtco.crm.nano.controller;

import com.peterservice.rtco.crm.nano.DictionaryApi;
import com.peterservice.rtco.crm.nano.dto.BankDto;
import com.peterservice.rtco.crm.nano.dto.CustomerStatusDto;
import com.peterservice.rtco.crm.nano.dto.CustomerTypeDto;
import com.peterservice.rtco.crm.nano.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dictionary")
public class DictionaryController implements DictionaryApi {

    @Autowired
    private DictionaryService dictionaryService;

    @Override
    @GetMapping("/banks")
    public List<BankDto> getAllBanks() {
        return dictionaryService.getAllBanks();
    }

    @Override
    @GetMapping("/banks/{id}")
    public BankDto getBankById(@PathVariable(name = "id") Long id) {
        return dictionaryService.getBankById(id);
    }

    @Override
    @GetMapping("/types")
    public List<CustomerTypeDto> getAllCustomersType() {
        return dictionaryService.getAllTypes();
    }

    @Override
    @GetMapping("/types/{id}")
    public CustomerTypeDto getTypeById(@PathVariable(name = "id") Long id) {
        return dictionaryService.getTypeById(id);
    }

    @Override
    @GetMapping("/statuses")
    public List<CustomerStatusDto> getAllCustomersStatus() {
        return dictionaryService.getAllStatuses();
    }

    @Override
    @GetMapping("/statuses/{id}")
    public CustomerStatusDto getStatusById(@PathVariable(name = "id") Long id) {
        return dictionaryService.getStatusById(id);
    }
}
