package com.peterservice.rtco.crm.nano.cam;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractFeignTest extends AbstractTest {

    @Autowired
    protected CamCustomerApiFeign customerApi;

    @Autowired
    protected CamDictionaryApiFeign dictionaryApi;
}
