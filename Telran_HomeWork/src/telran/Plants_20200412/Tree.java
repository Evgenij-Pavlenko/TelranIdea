package telran.Plants_20200412;

public class Tree extends Plants {
    private static final int TREE_GROW_PER_SEASON = 2;

    public Tree(String name, int age, int height) {
        super(name, age, height);
    }

    public Tree(String name) {
        super(name);
    }

    @Override
    public void doSpring() {
        addAge();
        setHeight(getHeight() + TREE_GROW_PER_SEASON);
        System.out.print("Spring -> ");
        System.out.println(toString());
    }

    @Override
    public void doSummer() {
        setHeight(getHeight() + TREE_GROW_PER_SEASON);
        System.out.print("Summer -> ");
        System.out.println(toString());

    }

    @Override
    public void doAutumn() {
        System.out.print("Autum -> ");
        System.out.println(toString());
    }
}
