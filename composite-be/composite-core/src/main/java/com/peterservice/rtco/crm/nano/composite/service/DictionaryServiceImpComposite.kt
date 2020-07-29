package com.peterservice.rtco.crm.nano.composite.service

import com.peterservice.rtco.crm.nano.cam.CamCustomerApiFeign
import com.peterservice.rtco.crm.nano.cam.CamDictionaryApiFeign
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DictionaryServiceImpComposite (
        @Autowired
        private val camDictionaryApiFeign: CamDictionaryApiFeign)
    : DictionaryServiceComposite {


}