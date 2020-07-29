package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.composite.dto.dto.CustomerDtoComposite

interface CustomerServiceComposite {
    fun getById(id: Long): CustomerDtoComposite
}
