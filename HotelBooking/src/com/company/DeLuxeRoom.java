package com.company;

public class DeLuxeRoom extends Room {
    String service = "You have DeLuxe service";
    private double price = super.getPrice()*3;

    public DeLuxeRoom(String number, int capacity) {
        super(number, capacity);
        this.price = price*0.5*capacity;
//        this.service = getService();
    }

    public DeLuxeRoom(String number) {
        super(number);
    }
    @Override
    public void doService(){
        super.doService();
        System.out.println("make something else");
    }
}