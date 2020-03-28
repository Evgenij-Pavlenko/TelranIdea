package com.company;

public class StandartRoom extends Room {

    private String service = "You have Standart service";
//    private String service = "You have Standart service";
    // почему не работает? - не присваивается каждому экземпляру при создании.
//    service - должно инициальзироваться после super(number, capacity);
//    с полем price такаяже проблема(
    private double price = super.getPrice()*2; // эта строка не инициализируется при создании экземпляра класса((


    public StandartRoom(String number, int capacity) {
        super(number, capacity);
        this.price = getPrice()*0.5*capacity; // только эта строка


    }

    public StandartRoom(String number) {
        super(number);
    }


    @Override
    public void doService(){
        super.doService();
        System.out.println("make nothing");
    }

}
