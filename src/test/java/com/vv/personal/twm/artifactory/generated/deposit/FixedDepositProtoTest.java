package com.vv.personal.twm.artifactory.generated.deposit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.vv.personal.twm.artifactory.generated.deposit.FixedDepositProto.InterestType.ON_MATURITY;
import static org.junit.Assert.assertEquals;

/**
 * @author Vivek
 * @since 27/11/20
 */
@RunWith(JUnit4.class)
public class FixedDepositProtoTest {

    @Test
    public void testFixedDepositCreation() {
        FixedDepositProto.FixedDeposit fixedDeposit = FixedDepositProto.FixedDeposit.newBuilder()
                .setUser("VIVEK")
                .setBankIFSC("XYZ1223343")
                .setDepositAmount(555555.23)
                .setRateOfInterest(9.3)
                .setStartDate("20201127")
                .setMonths(61)
                .setInterestType(ON_MATURITY)
                .setNominee("ITACHI")
                .build();

        assertEquals("VIVEK", fixedDeposit.getUser());
        assertEquals(ON_MATURITY, fixedDeposit.getInterestType());
        assertEquals(555555.23, fixedDeposit.getDepositAmount(), 10E-6);
    }
}