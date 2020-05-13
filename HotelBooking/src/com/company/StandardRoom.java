package com.company;

public class StandardRoom extends Room {
    private final double priceCoefficient=1.0;


    public StandardRoom(String number, int capacity) {
        super(number, capacity);
    }

    public StandardRoom(String number) {
        super(number);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public void duService() {
        System.out.println("done service for StandardRoom #" + getNumber());
    }

    @Override
    public String toString() {
        return "StandardRoom #" + getNumber()+" price is " + getPrice()+ "$ per day";
    }

}
