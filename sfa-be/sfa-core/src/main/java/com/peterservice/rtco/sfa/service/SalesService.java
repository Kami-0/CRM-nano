package com.peterservice.rtco.sfa.service;

import com.peterservice.rtco.sfa.api.commons.exceptions.EntityNotFoundException;
import com.peterservice.rtco.sfa.api.commons.types.EntityType;
import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.domain.SaleEntity;
import com.peterservice.rtco.sfa.repository.SaleRepository;
import com.peterservice.rtco.sfa.repository.SaleStatusRepository;
import com.peterservice.rtco.sfa.utils.DtoToEntityConverter;
import com.peterservice.rtco.sfa.utils.EntityToDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Daniil.Makarov
 */
@Service
public class SalesService {
    @Autowired
    private SaleStatusRepository saleStatusRepository;

    @Autowired
    private SaleRepository saleRepository;

    @Transactional
    public SaleDto getSaleById(long id) {
        SaleEntity saleEntity = saleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(EntityType.SALE, id));
        return DtoToEntityConverter.convert(saleEntity);
    }

    @Transactional
    public SaleDto createSale(SaleDto saleDto) {
        SaleEntity result = saleRepository.save(EntityToDtoConverter
                .convert(saleDto, saleStatusRepository.getOne(saleDto.getSstatSstatId())));
        return DtoToEntityConverter.convert(result);
    }
}
