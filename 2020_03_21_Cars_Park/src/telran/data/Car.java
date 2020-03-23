package telran.data;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private Color color;
    private int yearProduct;

    public Car(String brand, String model, Color color, int yearProduct) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearProduct = yearProduct;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getYearProduct() {
        return yearProduct;
    }

    @Override
    public String toString() {
        return "Car: " +brand + ", " +model + ", color: " + color + ", " + yearProduct + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return yearProduct == car.yearProduct &&
                brand.equals(car.brand) &&
                model.equals(car.model) &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearProduct);
    }
}
