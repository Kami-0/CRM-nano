package com.peterservice.rtco.sfa.feign.client;

import com.peterservice.commons.FeignClientBuilder;
import com.peterservice.rtco.sfa.feign.DictionaryApiFeign;
import com.peterservice.rtco.sfa.feign.SalesApiFeign;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ControllerFeignClients {

    @Value("${sfa.server.uri}")
    private String uri;

    @Bean
    public DictionaryApiFeign dictionaryClient() {
        return FeignClientBuilder.createClient(DictionaryApiFeign.class, uri);
    }

    @Bean
    public SalesApiFeign saleClient() {
        return FeignClientBuilder.createClient(SalesApiFeign.class, uri);
    }
}

