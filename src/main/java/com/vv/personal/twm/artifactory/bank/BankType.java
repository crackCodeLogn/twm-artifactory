package com.vv.personal.twm.artifactory.bank;

/**
 * @author Vivek
 * @since 16/11/20
 */
public enum BankType {
    GOVT("GOVT"),
    PRIVATE("PRIVATE");

    private String bankType;

    BankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankType() {
        return bankType;
    }
}
