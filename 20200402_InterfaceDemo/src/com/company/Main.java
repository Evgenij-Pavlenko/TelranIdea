package com.company;

public class Main {
    public static void main(String[] args) {
        CashOut[] cashOut = {
                new ATM(),
                new Clerk()
        };
        Person person = new Person("Andy");
        for (int i = 0; i < cashOut.length; i++) {
            cashOut[i].cashOut(person);
        }
    }
}
