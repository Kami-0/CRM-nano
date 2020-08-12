package com.peterservice.rtco.crm.nano.composite.feign.client

import com.peterservice.commons.FeignClientBuilder
import com.peterservice.rtco.crm.nano.composite.feign.DictionaryCompositeApiFeign
import com.peterservice.rtco.crm.nano.composite.feign.SaleCompositeApiFeign
import lombok.Getter
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Getter
@Configuration
open class ControllerCompositeFeignClients {

    @Value("\${server.uri}")
    private val uri: String? = null

    @Bean
    open fun dictionaryClient(): DictionaryCompositeApiFeign {
        return FeignClientBuilder.createClient(DictionaryCompositeApiFeign::class.java, uri)
    }

    @Bean
    open fun saleClient(): SaleCompositeApiFeign {
        return FeignClientBuilder.createClient(SaleCompositeApiFeign::class.java, uri)
    }

}