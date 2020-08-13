package com.peterservice.rtco.crm.nano.composite

import com.peterservice.rtco.crm.nano.composite.api.dto.sale.SaleCompositeDto
import com.peterservice.rtco.crm.nano.composite.feign.SaleCompositeApiFeign
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * @author Daniil.Makarov
 */
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SaleCompositeApiFeignTest {

    @Autowired
    lateinit var saleCompositeClient: SaleCompositeApiFeign

    /**
     * Проверка получения по id
     */
    @Test
    fun getById() {
        val actualSaleDto: SaleCompositeDto = saleCompositeClient.getSaleById(1L)
        Assertions.assertNotNull(actualSaleDto)
    }
}