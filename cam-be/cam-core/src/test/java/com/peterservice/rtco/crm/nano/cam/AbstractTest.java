package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.configuration.TestConfig;
import com.peterservice.rtco.crm.nano.cam.service.CustomerService;
import com.peterservice.rtco.crm.nano.cam.service.DictionaryService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfig.class,
        properties = {"server.port=8080"},
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ComponentScan
public abstract class AbstractTest {
    @Autowired
    public CustomerService customerService;

    @Autowired
    public DictionaryService dictionaryService;
}
