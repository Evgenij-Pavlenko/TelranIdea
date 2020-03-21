package telran.data;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearProdact;

    public Car(String brand, String model, String color, int yearProdact) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearProdact = yearProdact;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearProdact() {
        return yearProdact;
    }

    @Override
    public String toString() {
        return "Car:" +brand + ", " +model + ", color: " + color + ", " +yearProdact + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return yearProdact == car.yearProdact &&
                brand.equals(car.brand) &&
                model.equals(car.model) &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearProdact);
    }
}
