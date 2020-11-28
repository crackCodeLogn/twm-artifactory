package com.vv.personal.twm.artifactory;

import com.vv.personal.twm.artifactory.generated.deposit.FixedDepositProto;

/**
 * @author Vivek
 * @since 27/11/20
 */
public class FixedDepositKeyUtil {

    public static final String FD_KEY = "%s-%s-%.2f-%s-%d";

    private static String generateFdKey(String user, String ifsc, double depositAmount, String startDate, long insertionTime) {
        return String.format(FD_KEY, user, ifsc, depositAmount, startDate, insertionTime);
    }

    public static String generateFdKey(FixedDepositProto.FixedDeposit fixedDeposit) {
        return generateFdKey(fixedDeposit.getUser(), fixedDeposit.getBankIFSC(), fixedDeposit.getDepositAmount(), fixedDeposit.getStartDate(), fixedDeposit.getInsertionTime());
    }

    public static String generateFdKey(FixedDepositProto.FixedDeposit.Builder fixedDepositBuilder) {
        return generateFdKey(fixedDepositBuilder.getUser(), fixedDepositBuilder.getBankIFSC(), fixedDepositBuilder.getDepositAmount(), fixedDepositBuilder.getStartDate(), fixedDepositBuilder.getInsertionTime());
    }
}
