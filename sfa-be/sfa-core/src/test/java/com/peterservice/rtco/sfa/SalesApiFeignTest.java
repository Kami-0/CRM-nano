package com.peterservice.rtco.sfa;

import com.peterservice.rtco.sfa.api.dto.SaleDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SalesApiFeignTest {
    private final ControllerFeignClientBuilder feignClientBuilder = new ControllerFeignClientBuilder();
    private final SalesApiFeign saleClient = feignClientBuilder.getSaleClient();

    /**
     * Проверка создания валидно1 продажи
     */
//    @Test
//    void createSale() throws Exception {
//        SalesCreationDto validSalesCreationDto = SalesCreationDto.builder()
//                .cntrCntrId(1L)
//                .custCustId(1L)
//                .build();
//        SaleDto expectedSaleDto = SaleDto.builder()
//                .saleId(2L)
//                .saleStartDate(Instant.now())
//                .sstatSstatId(1L)
//                .cntrCntrId(1L)
//                .custCustId(1L)
//                .build();
//        SaleDto actualSaleDto = saleClient.createSale(validSalesCreationDto);
//        Assertions.assertEquals(expectedSaleDto, actualSaleDto);
//        log.debug("Expected:{}" + System.lineSeparator() + "Actual:{}", expectedSaleDto, actualSaleDto);
//    }
    @Test
    void getById() throws Exception {
        SaleDto actualSaleDto = saleClient.getSaleById(1L);
        log.debug(actualSaleDto.toString());
    }
}