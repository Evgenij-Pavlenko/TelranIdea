package telran;

public class Box2<T> {
private T box;

    public Box2(T box) {
        this.box = box;
    }

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "box=" + box +
                '}';
    }
}
