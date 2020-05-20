package telran.controller;

import telran.data.Flower;
import telran.data.Plant;
import telran.data.Tree;

public class PlantApp {
    public static void main(String[] args) {
        Plant tree = new Tree("Baobab", 100,1);
        Plant flower = new Flower("Tulip", 0, 1);
        Plant[] plants = {tree,flower};
//        System.out.println(tree);
//        tree.doSpring();
//        System.out.println(tree  );

        int yearsToGrow = 3;
        growPlantsForNumberOfYears(plants,yearsToGrow);

    }
    public static void growPlantsForNumberOfYears(Plant[] plants, int numberOfYears){
        for (int i = 0; i < numberOfYears; i++) {
            System.out.println("Year " + (i+1));
            for (Plant plant: plants){
                System.out.println();
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
                System.out.println("**************************");
            }
        }

    }
}
