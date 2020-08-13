package com.peterservice.rtco.crm.nano.composite.feign.client

import com.peterservice.commons.FeignClientBuilder
import com.peterservice.rtco.crm.nano.composite.feign.DictionaryCompositeApiFeign
import com.peterservice.rtco.crm.nano.composite.feign.SaleCompositeApiFeign
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Daniil.Makarov
 */
@Configuration
open class ControllerCompositeFeignClients {

    @Value("\${composite.server.uri}")
    private lateinit var uri: String

    @Bean
    open fun dictionaryCompositeClient(): DictionaryCompositeApiFeign {
        return FeignClientBuilder.createClient(DictionaryCompositeApiFeign::class.java, uri)
    }

    @Bean
    open fun saleCompositeClient(): SaleCompositeApiFeign {
        return FeignClientBuilder.createClient(SaleCompositeApiFeign::class.java, uri)
    }
}