package telran.controller;

import telran.dao.CarFleet;
import telran.data.Car;

public class CarFleetlApp {
    int size = 5;
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X5", "wheit", 2015);
        Car car2 = new Car("Mercedes", "CLS", "black", 2017);
        Car car3 = new Car("Tesla", "L", "blue", 2016);
        Car car4 = new Car("Opel", "Astra", "red", 2000);
        Car car5 = new Car("BMW", "X6", "black", 2019);

        CarFleet carFleet = new CarFleet(5);
        carFleet.addCar(car1);
        carFleet.addCar(car2);
        carFleet.addCar(car3);
        carFleet.addCar(car4);
        carFleet.addCar(car5);

        carFleet.displayCars();
//        carFleet.deleteCar(car2);
        System.out.println("------deleteCar()-----");
        carFleet.displayCars();
        System.out.println("--------getNewestAuto()---------");
        carFleet.getNewestAuto();
        System.out.println("--------displayAutoByColor()---------");
        carFleet.displayAutoByColor("black");
        System.out.println("---------getBrandCount()--------");
        carFleet.getBrandCount("opel");
    }
}
