package telran.dao;

import telran.data.Car;
import telran.data.Color;

public class CarFleet {
    private Car[] cars;
    private int size;

    public CarFleet(int capacity) {
        cars = new Car[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean addCar(Car car) {
        if (size < cars.length) {
            cars[size] = car;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteCar(Car car) {
        for (int i = 0; i < size; i++) {
            if (cars[i].equals(car)) {
                cars[i] = cars[size - 1];
                size--;
                System.out.println("Size CarFleet is: " + size);
                return true;
            }

        }
        System.out.println("Sorry, not Car");
        return false;
    }

    public void displayCars() {
        System.out.println("All cars:");
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }

    public void displayAutoByColor(Color color) {
        System.out.println("Car with color \"" + color + "\" is:");
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (cars[i].getColor().equals(color)) {
                System.out.println(cars[i].toString());
                flag = false;
            }
        }
        if (flag) System.out.println("Sorry, not collor");

    }

    public Car getNewestAuto() {
        int date = 0;
        Car car = null;
        for (int i = 0; i < size; i++) {
            if (cars[i].getYearProduct() > date) {
                date = cars[i].getYearProduct();
                car = cars[i];
            }
        }
        System.out.println("Newest Auto is " + car);
        return car;
    }

    public int getBrandCount(String brand) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(brand)) {
                brand = cars[i].getBrand();
                count++;
            }
        }
        System.out.println(brand + " is: " + count);
        return count;
    }


}
