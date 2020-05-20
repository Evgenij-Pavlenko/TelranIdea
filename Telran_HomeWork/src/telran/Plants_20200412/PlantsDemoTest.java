package telran.Plants_20200412;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlantsDemoTest {
    Flower flower1 = new Flower("Rose");
    Tree tree1 = new Tree("oak", 1, 20);
    Plants[] plants = new Plants[]{flower1, tree1};
    int years = 4; // test period

    @Test // int age
    public void testPlantsDemo1() {
        int startYearFlower = flower1.getAge();
        int startYearTree = tree1.getAge();
        PlantsDemo.doGrow(plants, years);
        assertEquals(startYearFlower + years, flower1.getAge());
        assertEquals(startYearTree + years, tree1.getAge());


    }

    @Test // int heght
    public void testPlantsDemo2() {
        int startHeightFlower = flower1.getHeight();
        int startHeightTree = tree1.getHeight();
        PlantsDemo.doGrow(plants, years);
        assertEquals(0, flower1.getHeight());
        assertEquals(startHeightTree + years * 2 * 2, tree1.getHeight());
    }

}
