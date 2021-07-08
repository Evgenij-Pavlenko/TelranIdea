import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
    PersonByNameComparator cp = new PersonByNameComparator();

        Comparator<Person> compareByAge = Comparator.comparing(Person::getAge);
        Comparator<Person> compareByName = Comparator.comparing(Person::getName);

    }
}
