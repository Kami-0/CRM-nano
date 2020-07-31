package com.peterservice.rtco.crm.nano.composite

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.peterservice.rtco.crm.nano"])
open class ApplicationKotlin

fun main(args: Array<String>) {
    SpringApplication.run(ApplicationKotlin::class.java, *args)
}
