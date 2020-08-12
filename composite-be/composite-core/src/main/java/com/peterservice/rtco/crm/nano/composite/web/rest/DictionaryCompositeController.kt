package com.peterservice.rtco.crm.nano.composite.web.rest


import com.peterservice.rtco.crm.nano.composite.api.DictionaryCompositeApi
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.BankDto
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerStatusDto
import com.peterservice.rtco.crm.nano.composite.api.dto.customer.CustomerTypeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleStatusCompositeDto
import com.peterservice.rtco.crm.nano.composite.service.DictionaryCompositeService
import com.peterservice.rtco.crm.nano.composite.service.DictionarySfaCompositeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dictionary")
class DictionaryCompositeController(
        @Autowired
        private val dictionaryService: DictionaryCompositeService,
        @Autowired
        private val dictionaryCompositeService: DictionarySfaCompositeService
) : DictionaryCompositeApi {
    @GetMapping(value = ["/sale/statuses"])
    override fun getAllSaleStatuses(): List<SaleStatusCompositeDto>? = dictionaryCompositeService.getAllSaleStatuses()

    @GetMapping(value = ["/sale/statuses/{id}"])
    override fun getSaleStatusById(@PathVariable id: Long): SaleStatusCompositeDto = dictionaryCompositeService.getSaleStatusById(id)

    @GetMapping("/banks")
    override fun getAllBanks(): List<BankDto> {
        return dictionaryService.getAllBanks()
    }

    @GetMapping("/banks/{id}")
    override fun getBankById(@PathVariable(name = "id") id: Long): BankDto {
        return dictionaryService.getBankById(id)
    }

    @GetMapping("/types")
    override fun getAllCustomersType(): List<CustomerTypeDto> {
        return dictionaryService.getAllTypes()
    }

    @GetMapping("/types/{id}")
    override fun getTypeById(@PathVariable(name = "id") id: Long): CustomerTypeDto {
        return dictionaryService.getTypeById(id)
    }

    @GetMapping("/statuses")
    override fun getAllCustomersStatus(): List<CustomerStatusDto> {
        return dictionaryService.getAllStatuses()
    }

    @GetMapping("/statuses/{id}")
    override fun getStatusById(@PathVariable(name = "id") id: Long): CustomerStatusDto {
        return dictionaryService.getStatusById(id)
    }
}