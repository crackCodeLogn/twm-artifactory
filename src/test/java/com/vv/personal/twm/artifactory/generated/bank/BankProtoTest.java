package com.vv.personal.twm.artifactory.generated.bank;

import static com.vv.personal.twm.artifactory.generated.bank.BankProto.BankType.PRIVATE;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Vivek
 * @since 27/11/20
 */
public class BankProtoTest {

  @Test
  public void bankObjectCreation() {

    BankProto.Bank bank =
        BankProto.Bank.newBuilder()
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
