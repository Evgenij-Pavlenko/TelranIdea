package telran;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    public static void main(String[] args) {
        Apple a1 = new Apple("green");
        Apple a2 = new Apple("red");

        Map<Apple, Integer> apples = new HashMap<>();
        apples.put(a1,10);
        apples.put(a2,20);

        System.out.println(apples.get(new Apple("green")));
    }
}
