package telran.Plants_20200412;

public class Flower extends Plants {

    private static final int FLOWER_GROW_PER_SEASON = 10;

    public Flower(String name) {
        super(name);
    }

    @Override
    public void doSpring() {
        addAge();
        setHeight(getHeight() + FLOWER_GROW_PER_SEASON);
        System.out.print("Spring -> ");
        System.out.println(toString());
    }

    @Override
    public void doSummer() {
        System.out.print("Summer -> ");
        System.out.println(toString());

    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.print("Autum -> ");
        System.out.println(toString());
    }
}
