package com.company;

public class DeLuxeRoom extends Room {
    private final double priceCoefficient=2.0;
    private double exclusiveService=0.0;

    public DeLuxeRoom(String number, int capacity, double exclusiveService) {
        super(number, capacity);
        this.exclusiveService=exclusiveService;
    }

    public DeLuxeRoom(String number, int capacity) {
        super(number, capacity);
    }

    public DeLuxeRoom(String number) {
        super(number);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient+exclusiveService;
    }

    @Override
    public void duService() {
        System.out.println("done service for DeLuxeRoom #" + getNumber());
    }

    @Override
    public String toString() {
        return "DeLuxeRoom #" + getNumber()+" price is " + getPrice()+ "$ per day (include exclusive service "+exclusiveService+")";
    }
}
