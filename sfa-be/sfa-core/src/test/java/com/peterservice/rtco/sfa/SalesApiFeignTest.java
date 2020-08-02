package com.peterservice.rtco.sfa;

import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.model.SaleDtoTest;
import com.peterservice.rtco.sfa.model.SalesCanceledDtoTest;
import com.peterservice.rtco.sfa.model.SalesCreationDtoTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
class SalesApiFeignTest {
    private final SalesApiFeign saleClient = new ControllerFeignClientBuilder().getSaleClient();

    /**
     * Проверка получения по id
     */
    @Test
    void getById() {
        SaleDto actualSaleDto = saleClient.getSaleById(1L);

        log("getById", SaleDto.class, actualSaleDto);
        Assertions.assertNotNull(actualSaleDto);
    }

    /**
     * Проверка создания валидной продажи
     */
    @Test
    @Transactional
    void createSale() {
        SaleDto expectedSaleDto = SaleDtoTest.getValidOpenInstance();
        SaleDto actualSaleDto = saleClient.createSale(SalesCreationDtoTest.getValidInstance());
        actualSaleDto.setSaleStartDate(expectedSaleDto.getSaleStartDate());
        expectedSaleDto.setSaleId(actualSaleDto.getSaleId());

        log("createSale", expectedSaleDto, actualSaleDto);
        Assertions.assertEquals(expectedSaleDto, actualSaleDto);
    }

    /**
     * Проверка отмены валидной продажи
     */
    @Test
    @Transactional
    void cancelSale() {
        SaleDto openSaleDto = saleClient.createSale(SalesCreationDtoTest.getValidInstance());
        long canceledSaleId = openSaleDto.getSaleId();
        SaleDto actualSaleDto = saleClient.cancelSale(SalesCanceledDtoTest.getValidInstance(), canceledSaleId);

        SaleDto expectedSaleDto = SaleDtoTest.getValidCancelInstance();
        actualSaleDto.setSaleStartDate(expectedSaleDto.getSaleStartDate());
        expectedSaleDto.setSaleId(actualSaleDto.getSaleId());
        expectedSaleDto.setSaleEndDate(actualSaleDto.getSaleEndDate());

        log("cancelSale", expectedSaleDto, actualSaleDto);
        Assertions.assertEquals(expectedSaleDto, actualSaleDto);
    }

    /**
     * Проверка закрытия валидной продажи
     */
    @Test
    @Transactional
    void closeSale() {
        SaleDto openSaleDto = saleClient.createSale(SalesCreationDtoTest.getValidInstance());
        long closedSaleId = openSaleDto.getSaleId();
        SaleDto actualSaleDto = saleClient.closeSale(closedSaleId);

        SaleDto expectedSaleDto = SaleDtoTest.getValidCloseInstance();
        actualSaleDto.setSaleStartDate(expectedSaleDto.getSaleStartDate());
        expectedSaleDto.setSaleEndDate(actualSaleDto.getSaleEndDate());
        expectedSaleDto.setSaleId(actualSaleDto.getSaleId());

        log("closeSale", expectedSaleDto, actualSaleDto);
        Assertions.assertEquals(expectedSaleDto, actualSaleDto);
    }

    private void log(String nameTest, Object expected, Object actual) {
        log.debug(System.lineSeparator() +
                "Test:{}" + System.lineSeparator() +
                "Expected:{}" + System.lineSeparator() +
                "Actual:{}" + System.lineSeparator(), nameTest, expected, actual);
    }
}