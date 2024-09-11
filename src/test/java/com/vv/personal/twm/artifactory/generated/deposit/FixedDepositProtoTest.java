package com.vv.personal.twm.artifactory.generated.deposit;

import static com.vv.personal.twm.artifactory.generated.deposit.FixedDepositProto.InterestType.ON_MATURITY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.vv.personal.twm.artifactory.util.FixedDepositKeyUtil;
import org.junit.jupiter.api.Test;

/**
 * @author Vivek
 * @since 27/11/20
 */
public class FixedDepositProtoTest {

  @Test
  public void fixedDepositCreation() {
    FixedDepositProto.FixedDeposit fixedDeposit =
        FixedDepositProto.FixedDeposit.newBuilder()
            .setUser("VIVEK")
            .setBankIFSC("XYZ1223343")
            .setDepositAmount(555555.23)
            .setCustomerId("12324242")
            .setFdNumber("3420940290492")
            .setRateOfInterest(9.3)
            .setStartDate("20201127")
            .setEndDate("20251227")
            .setMonths(61)
            .setInterestType(ON_MATURITY)
            .setNominee("ITACHI")
            .build();

    assertEquals("VIVEK", fixedDeposit.getUser());
    assertEquals(ON_MATURITY, fixedDeposit.getInterestType());
    assertEquals(555555.23, fixedDeposit.getDepositAmount(), 10E-6);

    String fdKey = FixedDepositKeyUtil.generateFdKey(fixedDeposit);
    System.out.println(fdKey);
    assertTrue(fdKey.matches("VIVEK-XYZ1223343-555555.23-20201127-[0-9]+"));
  }
}
