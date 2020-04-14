package telran.Plants_20200412;

public abstract class Plants {
    private String name;
    private int age;
    private int height;

    public Plants(String name) {
        this.name = name;
    }

    public Plants(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addAge() {
        age++;
    }

    public abstract void doSpring();

    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter() {  // same for all
        System.out.print("Winter -> ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name + ": " +
                "age = " + this.age +
                ", height = " + this.height + " ";
    }
}
