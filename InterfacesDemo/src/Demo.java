import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Faxable fax = new FaxDevice();

        Faxable fax2 = new Faxable() {
            @Override
            public void sendFax(String message) {
                System.out.println("Sending a message " + message);
            }

            @Override
            public String receiveFax() {
                String received = "receivied something";
                System.out.println(received);
                return received;
            }
        };
        fax2.receiveFax();
        fax2.sendFax("Hello world");

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(c.compare(5, 10));

        FaxDevice fd = new FaxDevice() {
            public void sendFax(String message) {
                System.out.println("Sending another message " + message);
            }
        };
        fd.sendFax("test");

        Device d = new Device() {
            @Override
            public void doCopy() {
                System.out.println("copying...");
            }
        };
        LengthCounter lengthCounter = new LengthCounter() {
            private String internalString = "42";

            @Override
            public int count(String string) {
                System.out.println("Hello world " + string);
                return string.length() + internalString.length();
            }
        };

        LengthCounter lengthCounter1 = s -> s.length();

        lengthCounter1.count("test");
        //a>b if a.length()>b.length()
        Comparator<String> c2 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
            }
        };
        String a1 = "1234";
        String b1 = "123";
        //подстановка подсказала
        Comparator<String> c3 = Comparator.comparing(a -> Integer.valueOf(a.length()));
        System.out.println(c3.compare(a1, b1));
        System.out.println(c2.compare(a1, b1));

        Predicate<Integer> p = i -> i > 0;
        System.out.println(p.test(0));
        System.out.println("--------Predicate----------");
        Predicate<String> p1 = s -> s.length() > 0;
//        Predicate<String> p1 = s -> !s.equals(""); // создается новый объект String - плохо по скорости
        System.out.println(p1.test(""));
        System.out.println(p1.test("dcdc"));
        System.out.println("-----------Person-------------");
        Predicate<Person> personPredicate = person -> person.getAge() > 21;
        Person person = new Person(36, "Ivan");
        System.out.println("Person " + person.getName() + " " + personPredicate.test(person));

        Function<Integer, Integer> f = x -> x * x;
        System.out.println(f.apply(10));

        Function<String, Integer> f2 = x -> x.length();
//        Function<String, Integer> f2 = String::length; //одинаково
        System.out.println(f2.apply("asd"));



        // "abc" -> "ABC"
        Function<String, String> f3 = s -> s.toUpperCase();
        System.out.println(f3.apply("abc"));

        Consumer<String>  consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };

        Consumer<String > consumer1 = System.out::println;
        //одинаковы
        Consumer<String > consumer2 = s-> System.out.println(s);
        consumer2.accept("Hello World");

        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());

        Function<String, String> toUpper = s-> s.toUpperCase();
        System.out.println(stringManipulator(toUpper, "Hello Word"));
        // равнозначно. но так можно без объявления объекта (Function<String, String> toUpper = s-> s.toUpperCase();)
        System.out.println(stringManipulator(s-> s.toUpperCase(), "Hello Word"));
        //равнозначно - с помощью метод-референс
        System.out.println(stringManipulator(String::toUpperCase, "Hello Word"));
//        System.out.println(stringManipulator(Integer::, "Hello Word"));

    }
    public static String stringManipulator(Function<String,String> f, String s){
        return "!"+ f.apply(s) + "!";
    }
    //"abc defG ikL" -> "ABC defG IKL"
    //length == 3 > to UpperCase
    //сделать на функциональных интерфейсах
    public static String transform (String sentence, Predicate<String> p, Function<String, String> s){

        return null;
    }
}
