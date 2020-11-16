package com.vv.personal.twm.artifactory.bank;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

/**
 * @author Vivek
 * @since 16/11/20
 */
public class Bank {
    private static final long serialVersionUID = -625467751396573206L;

    private String name;
    private BankType type; //govt / private
    private String IFSC;
    private long contactNumber;

    public Bank() {
    }

    public Bank(String name, BankType type, String IFSC) {
        this.name = name;
        this.type = type;
        this.IFSC = IFSC;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("name", name)
                .append("type", type.name())
                .append("IFSC", IFSC)
                .append("contactNumber", contactNumber)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(IFSC, bank.IFSC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IFSC);
    }

    public String getName() {
        return name;
    }

    public Bank setName(String name) {
        this.name = name;
        return this;
    }

    public BankType getType() {
        return type;
    }

    public Bank setType(BankType type) {
        this.type = type;
        return this;
    }

    public String getIFSC() {
        return IFSC;
    }

    public Bank setIFSC(String IFSC) {
        this.IFSC = IFSC;
        return this;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public Bank setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
}
