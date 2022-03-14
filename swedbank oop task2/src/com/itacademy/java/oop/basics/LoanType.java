package com.itacademy.java.oop.basics;

public enum LoanType {

    leasing("lease"),
    consumerLoan("cl");

    public final String loanType;

    LoanType(String loanType) {
        this.loanType = loanType;
    }
}
