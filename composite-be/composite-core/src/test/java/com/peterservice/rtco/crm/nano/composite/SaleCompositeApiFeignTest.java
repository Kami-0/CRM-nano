package com.peterservice.rtco.crm.nano.composite;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SaleCompositeApiFeignTest {

    private void log(String nameTest, Object expected, Object actual) {
        log.debug(System.lineSeparator() +
                "Test:{}" + System.lineSeparator() +
                "Expected:{}" + System.lineSeparator() +
                "Actual:{}" + System.lineSeparator(), nameTest, expected, actual);
    }
}