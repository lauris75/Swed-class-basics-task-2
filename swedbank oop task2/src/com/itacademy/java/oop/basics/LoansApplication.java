package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class LoansApplication {

    public static void main(String[] args) {
        Loan loan1 = new Loan(1, 1500, LoanType.leasing, LocalDate.of(2020, 1, 13));
        Loan loan2 = new Loan(1, 3200, LoanType.consumerLoan, LocalDate.of(2021, 6, 30));
        Customer cust1 = new Customer("Petras", "Petraitis", 25, 397050945);
        cust1.addLoan(loan1);
        cust1.addLoan(loan2);
        System.out.println(cust1.toString());
    }
}
