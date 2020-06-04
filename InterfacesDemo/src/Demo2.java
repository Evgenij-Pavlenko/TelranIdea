import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class Demo2 {
    public static void main(String[] args) {
        // "abcd" -> true
        // "abcde" - > false

        Predicate<String> p = s -> s.length() % 2 == 0;

        System.out.println(p.test("absd")); //true
        System.out.println(p.test("absde")); //false
        System.out.println(p.test("a")); //false
        System.out.println(p.test("aa")); //false
        System.out.println(p.test("aabbdd")); //false

        LocalDate now = LocalDate.now();
        System.out.println(now);

        Supplier<LocalDate> getDateNow = () -> {
            LocalDate date = LocalDate.now();
            return date;
        };
        System.out.println("-----------------");
        Consumer con = s -> System.out.println(LocalDate.now());
        System.out.println(getDateNow.get());

        Supplier<LocalDate> nowSupplier = () -> LocalDate.now();
        System.out.println(nowSupplier.get());

        Supplier<LocalDate> gesternDate = () -> LocalDate.now().minusDays(1);
        System.out.println(gesternDate.get());

        Supplier<LocalDate> yesterday = () -> now.minusDays(1);
        System.out.println();

        Function<String, Integer> getLength = Demo2::getLength;
        System.out.println(getLength.apply("asdcxz"));

        Function<String, Integer> divIde = Demo2::getDoubleLength;
        Function<String, Integer> divIde2 = Demo2::getDoubleLength;
        System.out.println("-------");
        doSomething(Demo2::getLength);

        // method Reference to an instabce method of an object

        Person person = new Person(21,"Piotr");
        Supplier getAge = person::getAge;
        System.out.println(getAge.get());
        Function<Person, Integer> getAge1 = Person::getAge;
        System.out.println(getAge1.apply(person));

        BiFunction<Integer, String, Person> newPerson = Person::new;
        Person ivan = newPerson.apply(40, "Ivan");

        System.out.println("----------Collections------------");
        List<String> names = Arrays.asList("ivan", "anna", "piotr", "sergey", "natalie");
        // 1 Variant
//        for (String name: names){
//            System.out.println(name);
//        }
        // 2 Variant
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        // 3 Variant
        names.stream().forEach(System.out::println);

    }

    public static int getLength(String s) {
        System.out.println("calling getLength");
        return s.length();
    }

    public static void doSomething(Function<String, Integer> f){
        System.out.println(f.apply("Hallo world")); //11 symbols - dlina stroki через метод  getLength()
    }
    public static int getDoubleLength(String s) {
        int l = s.length();
        System.out.println("calling getLength");
        return l*2;
    }
}
