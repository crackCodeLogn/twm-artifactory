package com.vv.personal.twm.artifactory.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Vivek
 * @since 16/11/20
 */
@RunWith(JUnit4.class)
public class BankTest {

    @Test
    public void testBankObjectCreation() {
        Bank bank = new Bank()
                .setName("SBI")
                .setType(BankType.PRIVATE)
                .setContactNumber(123456789)
                .setIFSC("SBI00102131");

        assertEquals("SBI", bank.getName());
        assertEquals(123456789L, bank.getContactNumber());
    }
}