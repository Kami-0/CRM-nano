package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.Customer;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class TestFeignClient {
    private static final Encoder ENCODER = new JacksonEncoder();
    private static final Decoder DECODER = new JacksonDecoder();

    public static void main(String[] args) {
        CamCustomerApiFeign camCustomerApiFeign = Feign.builder()
                .encoder(ENCODER)
                .decoder(DECODER)
                .target(CamCustomerApiFeign.class, "http://localhost:8080");
        Customer petrov = Customer.builder()
                .name("Petrov")
                .bankId(2L)
                .inn(5477878978L)
                .kpp(454667L)
                .statusStatusId(2L)
                .typeTypeId(1L)
                .build();
        Customer response = camCustomerApiFeign.createCustomer(petrov);
        System.out.println(response);
    }

}
