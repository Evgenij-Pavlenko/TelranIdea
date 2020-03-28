package com.company;

public class Room {
   private String number;
    private int capacity;
    private String service;
    private double price;

    public Room(String number, int capacity, String service, int price) {
        this.number = number;
        this.capacity = capacity;
        this.service = service;
        this.price = price;
    }

    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.price =price*1*capacity;
    }

    public Room(String number) {
        this.number = number;
        this.capacity = 1;
    }

    public String getService() {
        return service;
    }

    public double getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room: " +
                "number= " + number + ", " +
                ", capacity= " + capacity +
                ", service= " + service + ", " +
                ", price= " + price;
    }

    public void doService() {
        System.out.println("This is " + this.getClass().getSimpleName() + ", " + this.service);
    }
}
