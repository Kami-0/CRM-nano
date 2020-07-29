package com.peterservice.rtco.crm.nano.composite

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/test")
    fun testController() :String {
        return "Hello World"
    }
}