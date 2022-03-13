package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Loan {

    private int id;
    private double amount;
    private LoanType loanType;
    private LocalDate contractStartDate;

    public Loan() {}

    public Loan(int id, double amount, LoanType loanType, LocalDate contractStartDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.contractStartDate = contractStartDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public void setContractStartDate(LocalDate contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }
}
