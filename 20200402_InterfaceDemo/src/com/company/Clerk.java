package com.company;

public class Clerk implements CashOut {
    @Override
    public void cashOut(Person p) {
        System.out.println("Clerk is giving money for " + p);
    }
}
