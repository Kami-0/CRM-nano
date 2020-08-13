package com.peterservice.rtco.crm.nano.composite

import com.peterservice.rtco.crm.nano.composite.feign.DictionaryCompositeApiFeign
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DictionaryCompositeApiFeignTest {

    @Autowired
    lateinit var dictionaryCompositeApiFeign: DictionaryCompositeApiFeign

    @Test
    fun getAllSaleStatusesTest() {
        val allSaleStatuses = dictionaryCompositeApiFeign.getAllSaleStatuses()
        Assertions.assertFalse(allSaleStatuses!!.isEmpty())
    }
}