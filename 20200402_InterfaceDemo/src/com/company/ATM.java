package com.company;

public class ATM implements CashOut, CashIn {

    @Override
    public void cashOut(Person p) {
        System.out.println("ATM is giving money for " + p);
    }

    @Override
    public void cashIn() {

    }
}
