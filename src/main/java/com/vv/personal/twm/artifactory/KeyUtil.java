package com.vv.personal.twm.artifactory;

import com.vv.personal.twm.artifactory.generated.deposit.FixedDepositProto;

/**
 * @author Vivek
 * @since 27/11/20
 */
public class KeyUtil {

    public static final String FD_KEY = "%s-%s-%.2f-%s-%d";

    public static String generateFdKey(FixedDepositProto.FixedDeposit fixedDeposit) {
        return String.format(FD_KEY, fixedDeposit.getUser(), fixedDeposit.getBankIFSC(), fixedDeposit.getDepositAmount(), fixedDeposit.getStartDate(), fixedDeposit.getInsertionTime());
    }
}
