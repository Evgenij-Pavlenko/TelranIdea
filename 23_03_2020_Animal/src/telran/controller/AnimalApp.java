package telran.controller;

import telran.data.Animal;
import telran.data.Pet;
import telran.data.WildAnimal;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tiger", 4, "black-orange");
        Object animal2 = new Animal("Elephant", 12, "grey");
        Animal animal3 = new Pet("Dog", 6, "brown");
        Animal animal4 = new WildAnimal("Deer", 8, "hell-brown", "forest", 200);
        Pet animal5 = new Pet("Cat", 3, "white", "Murzik", "Roman");
//        Pet animal6 = (Pet) new Animal("Tiger", 4, "black-orange");
//        System.out.println(animal6.getNameOfOwner());
        System.out.println(animal1.getClass());
        System.out.println(animal3.getClass());
        System.out.println(animal4.getClass());

//        animal1 = (WildAnimal) animal1;
//        ((WildAnimal) animal1).setHabitat("jongle");
//        ((WildAnimal) animal1).setPopulation(1000000);
//        System.out.println(animal1.getClass().getName());

        animal1.run();
        animal4.run();
//        animal4 = (WildAnimal)animal4;
       ((WildAnimal) animal4).migration();
        animal5.play();
        animal5.run();
    }
}
