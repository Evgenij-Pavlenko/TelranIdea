package telran;

public class Box3<T extends Number> {
    private T box;

    public Box3(T box) {
        this.box = box;
    }

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }

    public void add(Box3 box3){
        this.setBox((T) new Double(this.box.doubleValue() + box3.box.doubleValue()));
    }
    @Override
    public String toString() {
        return "Box3{" +
                "box=" + box +
                '}';
    }
}
