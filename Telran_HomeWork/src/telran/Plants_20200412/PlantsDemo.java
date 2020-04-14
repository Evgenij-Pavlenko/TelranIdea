package telran.Plants_20200412;

public class PlantsDemo {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Rose");
        Tree tree1 = new Tree("oak", 1, 20);
        Plants[] plants = new Plants[]{flower1, tree1};
        int years = 4;
        doGrow(plants, years);

    }

    public static void doGrow(Plants[] plants, int years) {
        for (int i = 0; i < years; i++) {
            System.out.println("Year " + i);
            for (Plants p : plants) {
                p.doSpring();
                p.doSummer();
                p.doAutumn();
                p.doWinter();
                System.out.println("--------------------");
            }

        }
        System.out.println("=====================");
        for (Plants p : plants) {
            System.out.println("In " + years + " Years " + p.toString());
        }
    }
}
