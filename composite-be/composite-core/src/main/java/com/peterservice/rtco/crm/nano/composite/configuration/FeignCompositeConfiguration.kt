package com.peterservice.rtco.crm.nano.composite.configuration

import com.peterservice.rtco.crm.nano.cam.CamCustomerApiFeign
import com.peterservice.rtco.crm.nano.cam.CamDictionaryApiFeign
import com.peterservice.rtco.crm.nano.cam.CustomerApi
import com.peterservice.rtco.crm.nano.cam.DictionaryApi
import feign.Feign
import feign.jackson.JacksonDecoder
import feign.jackson.JacksonEncoder
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class FeignCompositeConfiguration {
    @Bean
    @ConditionalOnMissingBean(CamCustomerApiFeign::class)
    open fun camCustomerApiFeign(): CamCustomerApiFeign {
        return buildFeign(CamCustomerApiFeign::class.java)
    }

    @Bean
    @ConditionalOnMissingBean(CamDictionaryApiFeign::class)
    open fun camDictionaryApiFeign(): CamDictionaryApiFeign {
        return buildFeign(CamDictionaryApiFeign::class.java)
    }

    private fun <T> buildFeign(clazz: Class<T>): T {
        return Feign.builder()
                .encoder(JacksonEncoder())
                .decoder(JacksonDecoder())
                .target(clazz, "http://localhost:8080")
    }
}