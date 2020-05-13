package com.company;

public abstract class Room {
    private String number;
    private int capacity;
    private final double basePrice=100;

    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public Room(String number) {
        this.number = number;
        this.capacity = 1;
    }

    public abstract double getPrice();
    public abstract void duService();

    protected double getBasePrice() {
        return basePrice;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

}