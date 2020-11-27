package com.vv.personal.twm.artifactory.generated.bank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.vv.personal.twm.artifactory.generated.bank.BankProto.BankType.PRIVATE;
import static org.junit.Assert.assertEquals;

/**
 * @author Vivek
 * @since 27/11/20
 */
@RunWith(JUnit4.class)
public class BankProtoTest {

    @Test
    public void testBankObjectCreation() {

        BankProto.Bank bank = BankProto.Bank.newBuilder()
                .setName("SBI")
                .setBankType(PRIVATE)
                .setContactNumber("123456789")
                .setIFSC("SBI00102131")
                .build();

        assertEquals("SBI", bank.getName());
        assertEquals("123456789", bank.getContactNumber());
        assertEquals("SBI00102131", bank.getIFSC());
        assertEquals(PRIVATE, bank.getBankType());
    }
}