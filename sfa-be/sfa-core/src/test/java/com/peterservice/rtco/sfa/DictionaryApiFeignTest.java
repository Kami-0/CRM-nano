package com.peterservice.rtco.sfa;

import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;
import com.peterservice.rtco.sfa.feign.DictionaryApiFeign;
import com.peterservice.rtco.sfa.model.SaleStatusDtoTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Objects;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DictionaryApiFeignTest {

    @Autowired
    private DictionaryApiFeign dictionaryClient;

    /**
     * Проверяет пришли ли статусы продаж, хотя бы 1 должен быть
     */
    @Test
    void getAllSaleStatuses() {
        List<SaleStatusDto> allSaleStatuses = dictionaryClient.getAllSaleStatuses();
        Assertions.assertFalse(allSaleStatuses.isEmpty());
        log.debug(allSaleStatuses.toString());
    }

    /**
     * Проверяет что статусы продаж это обьекты, а не null
     */
    @Test
    void checkForNullOfSaleStatuses() {
        List<SaleStatusDto> allSaleStatuses = dictionaryClient.getAllSaleStatuses();
        Assertions.assertTrue(allSaleStatuses.stream().noneMatch(Objects::isNull));
        log.debug(allSaleStatuses.toString());
    }

    /**
     * Проверяет OPEN статус продажи
     */
    @Test
    void getSaleStatusById() {
        SaleStatusDto saleStatusDtoExpected = SaleStatusDtoTest.getOpenInstance();
        SaleStatusDto saleStatusByIdActual = dictionaryClient.getSaleStatusById(saleStatusDtoExpected.getSstatId());
        Assertions.assertEquals(saleStatusDtoExpected, saleStatusByIdActual);
        log.debug("{} ? {}", saleStatusDtoExpected, saleStatusByIdActual);
    }
}