package com.company;

public class Reception implements ObserverImpl {
    @Override
    public void handlerEvent(String number) {
        System.out.println("Call the Cleaner to clean room: " + number);
    }
}
