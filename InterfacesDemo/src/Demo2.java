import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) throws IOException {
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

        Person person = new Person(21, "Piotr");
        Supplier getAge = person::getAge;
        System.out.println(getAge.get());
        Function<Person, Integer> getAge1 = Person::getAge;
        System.out.println(getAge1.apply(person));

        BiFunction<Integer, String, Person> newPerson = Person::new;
        Person ivan = newPerson.apply(40, "Ivan");

        System.out.println("----------Collections------------");
        List<String> names = Arrays.asList("ivan", "anna", "piotr", "sergey", "natalie");
//         1 Variant
        for (String name : names) {
            System.out.println(name);
        }
//         2 Variant
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//         3 Variant
        names.stream().forEach(System.out::println);
        System.out.println("--------Stream-----------");
//        List<Integer> integerList = Arrays.asList(1, 3, 5, 7, 8, 10);
        List<Integer> integerList = Collections.emptyList();
        long count = integerList.stream().count();

        System.out.println("amount of integers " + count);
//        Optional<Integer> sum = integerList.stream().reduce((a, b) -> a + b);
        Integer integer = integerList.stream().reduce((a, b) -> a + b).orElse(0);
//        if (sum.isPresent()){
//            System.out.println(sum.get());
//        } else{
//            System.out.println("no sum");
//        }
//        System.out.println(sum.get());
        System.out.println(integer);

        Integer integer1 = integerList.stream().filter(a -> a > 5).reduce((a, b) -> a + b).orElse(0);
        System.out.println("filtered sum " + integer1);

        //1,3,5,7,8,10 -> "1357810"
        //1,3,5,7,8,10 -> "1, 3, 5, 7, 8, 10"
        List<Integer> integerList1 = Arrays.asList(1, 3, 5, 7, 8, 10);
        String s = integerList1.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(s);

        Map<Integer, List<String>> collect1 = names.stream().collect(Collectors.groupingBy(String::length));
        collect1.forEach((k, v) -> System.out.println(k + " = " + v));

        int sum1 = integerList.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);
        Stream<String> lines = Files.lines(Paths.get("text.txt"));
        lines.forEach(System.out::println);

        //1,2,3,5 -> "11", "22", "33", "55"
        List<Integer> intValue = Arrays.asList(1, 2, 3, 5);
        intValue.stream().map(Demo2::intToDoubleString).map(Demo2::toUperCase).reduce((a,b)->a+b);

    }
    public static String toUperCase(String s){
        System.out.println("toUpperCase " + s);
        return s.toUpperCase();
    }

    public static String intToDoubleString(int i) {
        System.out.println("intToDoubleString "+i);
        String val = String.valueOf(i);
        return val + val;
    }

    public static int getLength(String s) {
        System.out.println("calling getLength");
        return s.length();
    }

    public static void doSomething(Function<String, Integer> f) {
        System.out.println(f.apply("Hallo world")); //11 symbols - dlina stroki через метод  getLength()
    }

    public static int getDoubleLength(String s) {
        int l = s.length();
        System.out.println("calling getLength");
        return l * 2;
    }
}
