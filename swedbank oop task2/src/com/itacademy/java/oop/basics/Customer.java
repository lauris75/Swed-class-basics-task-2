package com.itacademy.java.oop.basics;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private List<Loan> loans;

    public Customer() {}

    public Customer(String name, String surname, int age, int personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void addLoan(Loan loan){
        loans.add(loan);
    }

    @Override
    public String toString() {
        double loanSum = 0;
        for(Loan loan: loans){
            loanSum = loanSum + loan.getAmount();
        }
        return "Customer{" +
                "name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", age =" + age +
                ", personalNumber =" + personalNumber +
                ", loans sum =" + loanSum +
                '}';
    }
}
