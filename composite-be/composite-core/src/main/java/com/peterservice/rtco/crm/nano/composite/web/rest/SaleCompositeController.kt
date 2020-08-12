package com.peterservice.rtco.crm.nano.composite.web.rest

import com.peterservice.rtco.crm.nano.composite.api.SaleCompositeApi
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCancellationCompositeDto
import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SalesCompositeCreationDto
import com.peterservice.rtco.crm.nano.composite.service.SalesCompositeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/sales"])
class SaleCompositeController(
        @Autowired
        private val salesCompositeService: SalesCompositeService
) : SaleCompositeApi {
    @GetMapping(value = ["/{id}"])
    override fun getSaleById(@PathVariable id: Long): SaleCompositeDto = salesCompositeService.getSaleById(id)

    @PostMapping(value = ["/create"])
    override fun createSale(@RequestBody salesCompositeCreationDto: SalesCompositeCreationDto): SaleCompositeDto =
            salesCompositeService.createSale(salesCompositeCreationDto)

    @PutMapping(value = ["/{id}/cancel"])
    override fun cancelSale(@RequestBody salesCancellationCompositeDto: SalesCancellationCompositeDto,
                            @PathVariable id: Long): SaleCompositeDto =
            salesCompositeService.cancelSale(salesCancellationCompositeDto, id)

    @PutMapping(value = ["/{id}/close"])
    override fun closeSale(@PathVariable id: Long): SaleCompositeDto = salesCompositeService.closeSale(id)

    @DeleteMapping(value = ["/{id}/delete"])
    override fun deleteSale(@PathVariable id: Long) = salesCompositeService.deleteSale(id)
}