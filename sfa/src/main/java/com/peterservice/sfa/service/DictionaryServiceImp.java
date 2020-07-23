package com.peterservice.sfa.service;

import com.peterservice.sfa.util.DtoToEntityConverter;
import com.peterservice.sfa.dto.SaleStatusDto;
import com.peterservice.sfa.repository.SaleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniil.Makarov
 */
@Service
public class DictionaryServiceImp implements DictionaryService {

    @Autowired
    private SaleStatusRepository saleStatusRepository;

    @Override
    public List<SaleStatusDto> getAllSaleStatuses() {
        return saleStatusRepository
                .findAll()
                .stream()
                .map(DtoToEntityConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public SaleStatusDto getSaleStatusById(Long id) {
        return null;
    }
}
