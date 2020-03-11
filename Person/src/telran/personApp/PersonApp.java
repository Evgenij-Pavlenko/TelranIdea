package telran.personApp;

import telran.data.Adress;
import telran.data.Person;

//import static telran.data.Adress.findByCity;
import static telran.data.Person.*;


public class PersonApp {
    public static void main(String[] args) {


        Person p1 = new Person("Evgenij", new Adress("Potsdam", "PotsdamerStr", 1));
        Person p2 = new Person("Oleg", new Adress("Berlin", "BerlinerStr", 2));
        Person p3 = new Person("Mark", new Adress("Koeln", "AdlerStr", 3));
        Person p4 = new Person("Alex", new Adress("Paris", "ParisStr", 4));
        Person p5 = new Person("Olga", new Adress("Berlin", "FriedfichStr", 6));

        System.out.println(p1);
        Person[] persons = new Person[]{p1, p2, p3, p4, p5};
        getPesons(persons);
        System.out.println("FindByName");
        findByName(persons, "Oleg");
        sortByStreet(persons);
        System.out.println("Sortet Arrey");
        getPesons(persons);
        findNamedByCity(persons, "berlin");
    }

}
