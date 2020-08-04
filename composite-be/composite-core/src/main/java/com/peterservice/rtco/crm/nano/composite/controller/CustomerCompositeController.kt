package com.peterservice.rtco.crm.nano.composite.controller
import com.peterservice.rtco.crm.nano.composite.dto.CustomerDto
import com.peterservice.rtco.crm.nano.composite.service.CustomerCompositeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

//@Import(FeignCompositeConfiguration::class)
@RestController
@RequestMapping("/composite")
class CustomerCompositeController (
        @Autowired
        private val customerService: CustomerCompositeService
) {
    @GetMapping
    fun getAllCustomers(
            @RequestParam(defaultValue = "5") limit: Int,
            @RequestParam(defaultValue = "0") offset: Int): List<CustomerDto> {
        return customerService.getAll(limit, offset)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable(name = "id") id: Long) = customerService.getById(id)

    @GetMapping("/{name}")
    fun getByName(@PathVariable(value = "name") name: String) = customerService.getByName(name)

    @PutMapping
    fun update(id: Long, customerDto: CustomerDto) = customerService.update(id, customerDto)

    @PostMapping
    fun create(@RequestBody customerDto: CustomerDto): CustomerDto {
        return customerService.create(customerDto)
    }

    @DeleteMapping
    fun delete(id: Long) = customerService.delete(id)
}