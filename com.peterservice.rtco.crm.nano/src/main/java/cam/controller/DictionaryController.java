package cam.controller;

import cam.dto.CustomerBankDto;
import cam.dto.CustomerDto;
import cam.dto.CustomerStatusDto;
import cam.dto.CustomerTypeDto;
import cam.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/banks")
    public List<CustomerBankDto> getAllCustomersBank() {
        return dictionaryService.getAllBanks();
    }

    @GetMapping("/types")
    public List<CustomerTypeDto> getAllCustomersType() {
        return dictionaryService.getAllTypes();
    }

    @GetMapping("/status")
    public List<CustomerStatusDto> getAllCustomersStatus() {
        return dictionaryService.getAllStatuses();
    }

    @GetMapping("/getBankById")
    public CustomerBankDto getBankById (@RequestParam(value = "id", required = true) Long id){
        return dictionaryService.getBankById(id);
    }

    @GetMapping("/getTypeById")
    public CustomerTypeDto getTypeById (@RequestParam(value = "id", required = true) Long id){
        return dictionaryService.getTypeById(id);
    }

    @GetMapping("/getStatusById")
    public CustomerStatusDto getStatusById (@RequestParam(value = "id", required = true) Long id){
        return dictionaryService.getStatusById(id);
    }
}
