package com.peterservice.rtco.crm.nano.composite.controller

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCancellationCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCompositeCreationDto
import com.peterservice.rtco.crm.nano.composite.service.SalesCompositeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/sales"])
class SaleCompositeController(
        @Autowired
        private val salesCompositeService: SalesCompositeService
) {
    @GetMapping(value = ["/{id}"])
    fun getSaleById(@PathVariable id: Long): SaleCompositeDto = salesCompositeService.getSaleById(id)


    @PostMapping(value = ["/create"])
    fun createSale(@RequestBody salesCompositeCreationDto: SalesCompositeCreationDto): SaleCompositeDto =
            salesCompositeService.createSale(salesCompositeCreationDto)

    @PutMapping(value = ["/{id}/cancel"])
    fun cancelSale(@RequestBody salesCancellationCompositeDto: SalesCancellationCompositeDto,
                   @PathVariable id: Long): SaleCompositeDto =
            salesCompositeService.cancelSale(salesCancellationCompositeDto, id)

    @PutMapping(value = ["/{id}/close"])
    fun closeSale(@PathVariable id: Long): SaleCompositeDto = salesCompositeService.closeSale(id)

    @DeleteMapping(value = ["/{id}/delete"])
    fun deleteSale(@PathVariable id: Long) = salesCompositeService.deleteSale(id)

}