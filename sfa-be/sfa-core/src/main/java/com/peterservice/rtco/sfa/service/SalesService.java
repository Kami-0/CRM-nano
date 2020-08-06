package com.peterservice.rtco.sfa.service;

import com.peterservice.rtco.sfa.api.common.exceptions.EntityNotFoundException;
import com.peterservice.rtco.sfa.api.common.types.EntityType;
import com.peterservice.rtco.sfa.api.dto.SaleDto;
import com.peterservice.rtco.sfa.api.dto.SalesCancellationDto;
import com.peterservice.rtco.sfa.api.dto.SalesCreationDto;
import com.peterservice.rtco.sfa.domain.SaleEntity;
import com.peterservice.rtco.sfa.repository.SaleRepository;
import com.peterservice.rtco.sfa.repository.SaleStatusRepository;
import com.peterservice.rtco.sfa.utils.DtoToEntityConverter;
import com.peterservice.rtco.sfa.utils.EntityToDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

import static com.peterservice.rtco.sfa.api.constan.StatusIdConstants.*;

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
    public SaleDto createSale(SalesCreationDto salesCreationDto) {
        SaleDto saleDto = convertSalesCreationDtoToSaleDto(salesCreationDto);
        SaleEntity result = saleRepository.save(EntityToDtoConverter
                .convert(saleDto, saleStatusRepository.getOne(saleDto.getSstatSstatId())));
        return DtoToEntityConverter.convert(result);
    }

    @Transactional
    public SaleDto cancelSale(SalesCancellationDto salesCancellationDto, long id) {
        SaleDto saleDto = DtoToEntityConverter.convert(saleRepository.getOne(id));
        saleDto.setCancelReason(salesCancellationDto.getCancelReason());
        saleDto.setSstatSstatId(SALES_CANCEL_STATUS_ID);
        saleDto.setSaleEndDate(Instant.now());
        SaleEntity result = saleRepository.save(EntityToDtoConverter
                .convert(saleDto, saleStatusRepository.getOne(saleDto.getSstatSstatId())));
        return DtoToEntityConverter.convert(result);
    }

    @Transactional
    public SaleDto closeSale(long id) {
        SaleDto saleDto = DtoToEntityConverter.convert(saleRepository.getOne(id));
        saleDto.setSstatSstatId(SALES_CLOSURE_STATUS_ID);
        saleDto.setSaleEndDate(Instant.now());
        SaleEntity result = saleRepository.save(EntityToDtoConverter
                .convert(saleDto, saleStatusRepository.getOne(saleDto.getSstatSstatId())));
        return DtoToEntityConverter.convert(result);
    }

    @Transactional
    public void deleteSale(long id) {
        saleRepository.delete(saleRepository.getOne(id));
    }

    private SaleDto convertSalesCreationDtoToSaleDto(SalesCreationDto salesCreationDto) {
        return SaleDto.builder()
                .saleStartDate(Instant.now())
                .custCustId(salesCreationDto.getCustCustId())
                .sstatSstatId(SALES_CREATE_STATUS_ID)
                .cntrCntrId(salesCreationDto.getCntrCntrId())
                .build();
    }
}
