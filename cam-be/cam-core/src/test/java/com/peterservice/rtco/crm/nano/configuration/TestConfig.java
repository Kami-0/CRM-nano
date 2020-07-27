package com.peterservice.rtco.crm.nano.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.peterservice.rtco.crm.nano")
@EnableAutoConfiguration
@Import(JacksonAutoConfiguration.class)
public class TestConfig {
}
