package de.telran.model;

public class Customer {
    String name;
    int age;
    BankAccount bankAccount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Customer(String name, int age, BankAccount account) {
        this.name = name;
        this.age = age;
        this.bankAccount = account;
    }
}
