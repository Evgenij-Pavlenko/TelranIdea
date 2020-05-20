package telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};

        List<Integer> arrInteger = Arrays.asList(arr);
        Collections.sort(arrInteger);

        System.out.println(arr[0] < arr[1]);

        String[] arrString = {"aa", "bb", "xx", "yy", "ab", "ya"};
        List<String> list = Arrays.asList(arrString);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Person ivan = new Person("Ivan", 40);
        Person piotr = new Person("Piotr", 22);
        Person anna = new Person("Anna", 50);

        List<Person> people = Arrays.asList(ivan, piotr, anna);
        List<Person> peopleSortetByName = new ArrayList<>(people);

        System.out.println(people);
        Collections.sort(peopleSortetByName);

        System.out.println(sortByName(people));
//        Person p1>Person p2 =>p1.age > p2.age
        System.out.println(people);
        Collections.sort(people, new PersonByAgeComparator());
        System.out.println(people);

    }
//хороший тон - работать с копией списка
    public static List<Person> sortByName(List<Person> people){
        List<Person> ret = new ArrayList<>(people);
        Collections.sort(ret);
        return ret;
    }
}
