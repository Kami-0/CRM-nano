package com.peterservice.rtco.crm.nano.cam;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamFeignAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(CamCustomerApiFeign.class)
    public CamCustomerApiFeign camCustomerApiFeign() {
        return buildFeign(CamCustomerApiFeign.class);
    }

    @Bean
    @ConditionalOnMissingBean(CamDictionaryApiFeign.class)
    public CamDictionaryApiFeign camDictionaryApiFeign() {
        return buildFeign(CamDictionaryApiFeign.class);
    }

    private <T> T buildFeign(Class<T> clazz) {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(clazz, "http://localhost:55003"); // TODO get url from spring config
    }
}
