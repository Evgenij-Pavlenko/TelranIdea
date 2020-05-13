package com.company;

public class SuiteRoom extends Room {
    private final double priceCoefficient=1.3;

    public SuiteRoom(String number, int capacity) {
        super(number, capacity);
    }

    public SuiteRoom(String number) {
        super(number);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public void duService() {
        System.out.println("done service for SuiteRoom #" + getNumber());
    }

    @Override
    public String toString() {
        return "SuiteRoom #" + getNumber()+" price is " + getPrice()+ "$ per day";
    }


}
