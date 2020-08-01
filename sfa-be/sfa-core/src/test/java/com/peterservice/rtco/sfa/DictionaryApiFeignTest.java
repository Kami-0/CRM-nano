package com.peterservice.rtco.sfa;

import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

@Slf4j
class DictionaryApiFeignTest {
    private static final long OPEN_STATUS_ID = 1;

    private final ControllerFeignClientBuilder feignClientBuilder = new ControllerFeignClientBuilder();
    private final DictionaryApiFeign dictionaryClient = feignClientBuilder.getDictionaryClient();

    /**
     * Проверяет пришли ли статусы продаж, хотя бы 1 должен быть
     */
    @Test
    void getAllSaleStatuses() throws Exception {
        List<SaleStatusDto> allSaleStatuses = dictionaryClient.getAllSaleStatuses();
        Assertions.assertFalse(allSaleStatuses.isEmpty());
        log.debug(allSaleStatuses.toString());
    }

    /**
     * Проверяет что статусы продаж это обьекты, а не null
     */
    @Test
    void checkForNullOfSaleStatuses() throws Exception {
        List<SaleStatusDto> allSaleStatuses = dictionaryClient.getAllSaleStatuses();
        Assertions.assertTrue(allSaleStatuses.stream().noneMatch(Objects::isNull));
        log.debug(allSaleStatuses.toString());
    }

    /**
     * Проверяет OPEN статус продажи
     */
    @Test
    void getSaleStatusById() throws Exception {
        SaleStatusDto saleStatusById = dictionaryClient.getSaleStatusById(OPEN_STATUS_ID);
        SaleStatusDto saleStatusDto = SaleStatusDto.builder()
                .sstatId(OPEN_STATUS_ID)
                .keyName("OPEN")
                .name("open")
                .isActiveYn(true)
                .build();
        Assertions.assertEquals(saleStatusById, saleStatusDto);
        log.debug("{} ? {}", saleStatusById, saleStatusDto);
    }
}