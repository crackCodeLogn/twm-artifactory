package com.vv.personal.twm.artifactory.deposit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * @author Vivek
 * @since 27/11/20
 */
@RunWith(JUnit4.class)
public class FixedDepositTest {

    @Test
    public void testFixedDepositCreation() {
        FixedDeposit fixedDeposit = new FixedDeposit()
                .setUser("VIVEK")
                .setBankIfsc("XYZ1223343")
                .setDepositAmount(555555.23)
                .setRateOfInterest(9.3)
                .setStartDate("20201127")
                .setMonths(61)
                .setMaturityType("POST_TENURE")
                .setNominee("ITACHI")
                .generateKey();

        assertEquals("{\"user\":\"VIVEK\",\"bankIfsc\":\"XYZ1223343\",\"depositAmount\":555555.23,\"rateOfInterest\":9.3,\"startDate\":\"20201127\",\"months\":61,\"days\":0,\"maturityType\":\"POST_TENURE\",\"nominee\":\"ITACHI\",\"insertionTime\":1606439677128,\"key\":\"VIVEK-XYZ1223343-555555.23-20201127-1606439677128\"}", fixedDeposit.toString());
        System.out.println(fixedDeposit.toString());
    }
}