package com.peterservice.rtco.crm.nano.cam;

import com.peterservice.rtco.crm.nano.cam.dto.Bank;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DictionaryFeignTest extends AbstractFeignTest {

    @Test
    public void testGetAllBanks() {
        List<Bank> banksFromService = dictionaryService.getAllBanks();
        List<Bank> response = dictionaryApi.getAllBanks();
        Assert.assertNotNull(response);
        Assert.assertEquals(banksFromService.size(), response.size());
    }

    @Test
    public void testBankById() {
        List<Bank> banksFromService = dictionaryService.getAllBanks();
        for(Bank bank : banksFromService) {
            Bank response = dictionaryApi.getBankById(bank.getBankId());
            Assert.assertNotNull(response);
            Assert.assertEquals(bank.getName(), response.getName());
            Assert.assertEquals(bank.getAddress(), response.getAddress());
            Assert.assertEquals(bank.getBik(), response.getBik());
            Assert.assertEquals(bank.getCorrAccount(), response.getCorrAccount());
            Assert.assertEquals(bank.getInn(), response.getInn());
            Assert.assertEquals(bank.getKpp(), response.getKpp());
        }
    }
}
