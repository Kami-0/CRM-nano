package com.peterservice.rtco.crm.nano.composite.controller


import com.peterservice.rtco.crm.nano.composite.dto.BankDto
import com.peterservice.rtco.crm.nano.composite.dto.CustomerStatusDto
import com.peterservice.rtco.crm.nano.composite.dto.CustomerTypeDto
import com.peterservice.rtco.crm.nano.composite.service.DictionaryCompositeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//@Import(FeignCompositeConfiguration::class)
@RestController
@RequestMapping("/dictionary")
class DictionaryCompositeController (
    @Autowired
    private val dictionaryService: DictionaryCompositeService
) {

    @GetMapping("/banks")
    fun getAllBanks(): List<BankDto> {
        return dictionaryService.getAllBanks()
    }

    @GetMapping("/banks/{id}")
    fun getBankById(@PathVariable(name = "id") id: Long): BankDto {
        return dictionaryService.getBankById(id)
    }

    @GetMapping("/types")
    fun getAllCustomersType(): List<CustomerTypeDto> {
        return dictionaryService.getAllTypes()
    }

    @GetMapping("/types/{id}")
    fun getTypeById(@PathVariable(name = "id") id: Long): CustomerTypeDto {
        return dictionaryService.getTypeById(id)
    }

    @GetMapping("/statuses")
    fun getAllCustomersStatus(): List<CustomerStatusDto> {
        return dictionaryService.getAllStatuses()
    }

    @GetMapping("/statuses/{id}")
    fun getStatusById(@PathVariable(name = "id") id: Long): CustomerStatusDto {
        return dictionaryService.getStatusById(id)
    }

}