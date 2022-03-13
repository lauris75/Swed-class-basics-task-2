package com.itacademy.java.oop.basics;

public enum LoanType {

    leasing("lease"),
    consumerLoan("cl");

    public final String loanType;

    LoanType(String loanType) {
        this.loanType = loanType;
    }

    public static LoanType valueOfCode(String loanType) {
        for (LoanType e : values()) {
            if (e.loanType.equals(loanType)) {
                return e;
            }
        }
        return null;
    }

}