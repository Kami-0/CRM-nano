package com.peterservice.rtco.crm.nano.composite.controller

import com.peterservice.rtco.crm.nano.composite.configuration.FeignCompositeConfiguration
import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerDtoComposite
import com.peterservice.rtco.crm.nano.composite.service.CustomerServiceComposite
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Import
import org.springframework.web.bind.annotation.*

@Import(FeignCompositeConfiguration::class)
@RestController
@RequestMapping("/composite")
class CustomerControllerComposite (
        @Autowired
        private val customerService: CustomerServiceComposite
) {
    @GetMapping
    fun getAllCustomers(
            @RequestParam(defaultValue = "5") limit: Int,
            @RequestParam(defaultValue = "0") offset: Int): List<CustomerDtoComposite> {
        return customerService.getAll(limit, offset)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable(name = "id") id: Long) = customerService.getById(id)

    @GetMapping("/{name}")
    fun getByName(@PathVariable(value = "name") name: String) = customerService.getByName(name)

    @PutMapping
    fun update(id: Long, customerDtoComposite: CustomerDtoComposite) = customerService.update(id, customerDtoComposite)

    @PostMapping
    fun create(@RequestBody customerDtoComposite: CustomerDtoComposite): CustomerDtoComposite {
        return customerService.create(customerDtoComposite)
    }

    @DeleteMapping
    fun delete(id: Long) = customerService.delete(id)
}