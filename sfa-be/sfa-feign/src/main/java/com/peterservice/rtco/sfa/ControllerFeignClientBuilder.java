package com.peterservice.rtco.sfa;

import com.peterservice.rtco.sfa.decoder.InstantGsonDecoder;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonEncoder;
import feign.slf4j.Slf4jLogger;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ControllerFeignClientBuilder {

    @Value("${server.uri}")
    private String uri;

    @Bean
    public DictionaryApiFeign dictionaryClient() {
        return createClient(DictionaryApiFeign.class);
    }

    @Bean
    public SalesApiFeign saleClient() {
        return createClient(SalesApiFeign.class);
    }

    private <T> T createClient(Class<T> type) {
        return Feign.builder()
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .encoder(new GsonEncoder())
                .decoder(new InstantGsonDecoder())
                .target(type, uri);
    }
}

