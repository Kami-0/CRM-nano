package com.peterservice.rtco.sfa;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonEncoder;
import feign.slf4j.Slf4jLogger;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
//@PropertySource("classpath:application.properties")
public class ControllerFeignClientBuilder {
    private static final String URI = "http://localhost:8080";

    //todo: спросить у Саши
//    @Value("${server.uri}")
//    private String uri;

    private final DictionaryApiFeign dictionaryClient = createClient(DictionaryApiFeign.class);
    private final SalesApiFeign saleClient = createClient(SalesApiFeign.class);

    private <T> T createClient(Class<T> type) {
        return Feign.builder()
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .encoder(new GsonEncoder())
                .decoder(new InstantGsonDecoder())
                .target(type, URI);
    }
}

