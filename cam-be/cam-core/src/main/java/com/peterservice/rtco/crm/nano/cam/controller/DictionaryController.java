package com.peterservice.rtco.crm.nano.cam.controller;

import com.peterservice.rtco.crm.nano.cam.DictionaryApi;
import com.peterservice.rtco.crm.nano.cam.dto.Bank;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerStatus;
import com.peterservice.rtco.crm.nano.cam.dto.CustomerType;
import com.peterservice.rtco.crm.nano.cam.service.DictionaryService;
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
    public List<Bank> getAllBanks() {
        return dictionaryService.getAllBanks();
    }

    @Override
    @GetMapping("/banks/{id}")
    public Bank getBankById(@PathVariable(name = "id") Long id) {
        return dictionaryService.getBankById(id);
    }

    @Override
    @GetMapping("/types")
    public List<CustomerType> getAllCustomersType() {
        return dictionaryService.getAllTypes();
    }

    @Override
    @GetMapping("/types/{id}")
    public CustomerType getTypeById(@PathVariable(name = "id") Long id) {
        return dictionaryService.getTypeById(id);
    }

    @Override
    @GetMapping("/statuses")
    public List<CustomerStatus> getAllCustomersStatus() {
        return dictionaryService.getAllStatuses();
    }

    @Override
    @GetMapping("/statuses/{id}")
    public CustomerStatus getStatusById(@PathVariable(name = "id") Long id) {
        return dictionaryService.getStatusById(id);
    }
}
