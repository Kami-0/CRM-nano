package com.peterservice.rtco.crm.nano.composite.controller

import com.peterservice.rtco.crm.nano.composite.configuration.FeignCompositeConfiguration
import com.peterservice.rtco.crm.nano.composite.dto.dto.BankDtoComposite
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerStatusDtoComposite
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerTypeDtoComposite
import com.peterservice.rtco.crm.nano.composite.service.DictionaryServiceComposite
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Import
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Import(FeignCompositeConfiguration::class)
@RestController
@RequestMapping("/dictionary")
class DictionaryControllerComposite (
    @Autowired
    private val dictionaryService: DictionaryServiceComposite
) {

    @GetMapping("/banks")
    fun getAllBanks(): List<BankDtoComposite> {
        return dictionaryService.getAllBanks()
    }

    @GetMapping("/banks/{id}")
    fun getBankById(@PathVariable(name = "id") id: Long): BankDtoComposite {
        return dictionaryService.getBankById(id)
    }

    @GetMapping("/types")
    fun getAllCustomersType(): List<CustomerTypeDtoComposite> {
        return dictionaryService.getAllTypes()
    }

    @GetMapping("/types/{id}")
    fun getTypeById(@PathVariable(name = "id") id: Long): CustomerTypeDtoComposite {
        return dictionaryService.getTypeById(id)
    }

    @GetMapping("/statuses")
    fun getAllCustomersStatus(): List<CustomerStatusDtoComposite> {
        return dictionaryService.getAllStatuses()
    }

    @GetMapping("/statuses/{id}")
    fun getStatusById(@PathVariable(name = "id") id: Long): CustomerStatusDtoComposite {
        return dictionaryService.getStatusById(id)
    }

}