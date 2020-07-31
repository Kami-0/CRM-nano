package com.peterservice.rtco.sfa;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.Getter;

@Getter
public class ControllerFeignClientBuilder {
    private static final String URI = "http://localhost:8080";

    private final DictionaryApiFeign dictionaryClient = createClient(DictionaryApiFeign.class);
    private final SalesApiFeign saleClient = createClient(SalesApiFeign.class);

    private static <T> T createClient(Class<T> type) {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(type, URI);
    }
}

