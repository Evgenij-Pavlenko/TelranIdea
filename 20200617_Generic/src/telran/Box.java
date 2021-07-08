package telran;

public class Box {
    private Object box;

    public Box(Object box) {
        this.box = box;
    }

    public Object getBox() {
        return box;
    }

    public void setBox(Object box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "box=" + box +
                '}';
    }

    public String checkType() {
        if (box instanceof String) {
            return "String";
        } else if (box instanceof Integer) {
            return "Integer";
        } else {
            return "Unknow type";
        }
    }
}
