package com.peterservice.rtco.crm.nano;

import com.peterservice.rtco.crm.nano.configuration.TestConfig;
import com.peterservice.rtco.crm.nano.service.CustomerService;
import com.peterservice.rtco.crm.nano.service.DictionaryService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfig.class,
        properties = {"server.port=55003"},
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ComponentScan
public abstract class AbstractTest {
    @Autowired
    public CustomerService customerService;

    @Autowired
    public DictionaryService dictionaryService;
}
