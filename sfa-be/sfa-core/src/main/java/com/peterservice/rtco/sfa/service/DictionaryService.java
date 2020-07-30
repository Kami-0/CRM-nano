package com.peterservice.rtco.sfa.service;

import com.peterservice.rtco.sfa.api.common.exceptions.EntityNotFoundException;
import com.peterservice.rtco.sfa.api.common.types.EntityType;
import com.peterservice.rtco.sfa.api.dto.SaleStatusDto;
import com.peterservice.rtco.sfa.domain.SaleStatusEntity;
import com.peterservice.rtco.sfa.repository.SaleStatusRepository;
import com.peterservice.rtco.sfa.utils.DtoToEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniil.Makarov
 */
@Service
public class DictionaryService {

    @Autowired
    private SaleStatusRepository saleStatusRepository;

    public List<SaleStatusDto> getAllSaleStatuses() {
        return saleStatusRepository
                .findAll()
                .stream()
                .map(DtoToEntityConverter::convert)
                .collect(Collectors.toList());
    }

    public SaleStatusDto getSaleStatusById(long id) {
        SaleStatusEntity saleStatusEntity = saleStatusRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(EntityType.SALE_STATUS, id));
        return DtoToEntityConverter.convert(saleStatusEntity);
    }
}
