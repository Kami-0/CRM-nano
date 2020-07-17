package cam.service;

import cam.dto.CustomerBankDto;
import cam.dto.CustomerStatusDto;
import cam.dto.CustomerTypeDto;

import java.util.List;

public interface DictionaryService {
    List<CustomerTypeDto> getAllTypes();

    List<CustomerStatusDto> getAllStatuses();

    List<CustomerBankDto> getAllBanks();

    CustomerTypeDto getTypeById(Long id);

    CustomerStatusDto getStatusById(Long id);

    CustomerBankDto getBankById(Long id);
}
