package com.company;

public class SiuteRoom extends Room {
    private String service = "You have Suite service";
    private double price = super.getPrice()*2;

    public SiuteRoom(String number, int capacity) {
        super(number, capacity);
        this.price = getPrice()*0.5*capacity;
    }

    public SiuteRoom(String number) {
        super(number);
    }
    @Override
    public void doService(){
        super.doService();
        System.out.println("make something");
    }
}