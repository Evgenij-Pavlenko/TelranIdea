package com.company;

public class Cleaner implements ObserverImpl {
    @Override
    public void handlerEvent(String number) {
        System.out.println("Cleaning room: " + number);
    }
}
