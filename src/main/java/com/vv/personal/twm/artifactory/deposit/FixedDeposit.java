package com.vv.personal.twm.artifactory.deposit;

import com.vv.personal.twm.artifactory.bank.Bank;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

import static com.vv.personal.twm.artifactory.constants.Constants.FD_KEY;

/**
 * @author Vivek
 * @since 16/11/20
 */
public class FixedDeposit {

    private String user;
    private Bank bank;
    private double depositAmount;
    private double rateOfInterest;
    private String startDate; //YYYYMMDD
    private int months; //golden std for tracking
    private int days;
    private String maturityType;
    private String nominee;
    private final long insertionTime;
    private String key;

    public FixedDeposit() {
        this.insertionTime = System.currentTimeMillis();
    }

    public FixedDeposit(String user, Bank bank, double depositAmount, double rateOfInterest, String startDate, int months, int days, String maturityType, String nominee) {
        this();
        this.user = user;
        this.bank = bank;
        this.depositAmount = depositAmount;
        this.rateOfInterest = rateOfInterest;
        this.startDate = startDate;
        this.months = months;
        this.days = days;
        this.maturityType = maturityType;
        this.nominee = nominee;

        generateKey();
    }

    public FixedDeposit generateKey() {
        this.key = String.format(FD_KEY, user, bank, depositAmount, startDate, insertionTime);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("user", user)
                .append("bank", bank)
                .append("depositAmount", depositAmount)
                .append("rateOfInterest", rateOfInterest)
                .append("startDate", startDate)
                .append("months", months)
                .append("days", days)
                .append("maturityType", maturityType)
                .append("nominee", nominee)
                .append("insertionTime", insertionTime)
                .append("key", key)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FixedDeposit that = (FixedDeposit) o;
        return getKey().equals(that.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }

    public String getUser() {
        return user;
    }

    public FixedDeposit setUser(String user) {
        this.user = user;
        return this;
    }

    public Bank getBank() {
        return bank;
    }

    public FixedDeposit setBank(Bank bank) {
        this.bank = bank;
        return this;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public FixedDeposit setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public FixedDeposit setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public FixedDeposit setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public int getMonths() {
        return months;
    }

    public FixedDeposit setMonths(int months) {
        this.months = months;
        return this;
    }

    public int getDays() {
        return days;
    }

    public FixedDeposit setDays(int days) {
        this.days = days;
        return this;
    }

    public String getMaturityType() {
        return maturityType;
    }

    public FixedDeposit setMaturityType(String maturityType) {
        this.maturityType = maturityType;
        return this;
    }

    public String getNominee() {
        return nominee;
    }

    public FixedDeposit setNominee(String nominee) {
        this.nominee = nominee;
        return this;
    }

    public long getInsertionTime() {
        return insertionTime;
    }

    public String getKey() {
        return key;
    }
}
