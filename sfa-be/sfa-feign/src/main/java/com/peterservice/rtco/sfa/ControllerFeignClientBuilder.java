package com.peterservice.rtco.sfa;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonEncoder;
import feign.slf4j.Slf4jLogger;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
@ComponentScan
public class ControllerFeignClientBuilder {
    private String uri;

    @Bean
    public DictionaryApiFeign dictionaryClient(@Value("${server.uri}") String uri) {
        this.uri = uri;
        return createClient(DictionaryApiFeign.class);
    }

    private final SalesApiFeign saleClient = createClient(SalesApiFeign.class);

    private <T> T createClient(Class<T> type) {
        return Feign.builder()
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .encoder(new GsonEncoder())
                .decoder(new InstantGsonDecoder())
                .target(type, uri);
    }
}

