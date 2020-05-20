package telran;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;
import java.util.Scanner;

public class Car {


    String vin;
    int year;
    String color;

    public Car(String vin, int year, String color) {
        this.vin = vin;
        this.year = year;
        this.color = color;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int i = sc.nextInt();
        System.out.println("You have entered "+ i);
        Car c1 = new Car("123",2009,"red");
        Car c2 = new Car("123", 2009,"red");

        System.out.println(c1.equals(c2));
        String s1 = new String("test");
        String s2 = new String("test");
        System.out.println(s1==s2);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(vin, car.vin) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, year, color);
    }
}

