import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Ivan", 1500);
        Person p2 = new Person("Piotr", 1800);
        Person p3 = new Person("Maria", 2500);
        Person p4 = new Person("John", 1100);
        Person p5 = new Person("Anna1", 1200);
        Person p6 = new Person("Anna2", 1300);
        Person p7 = new Person("Anna3", 1400);
        Person p8 = new Person("Anna4", 1600);
        Person p9 = new Person("Anna4", 1600);
        Person p10 = new Person("Anna4", 1600);
        Person p11 = new Person("Anna4", 1600);
        Person p12 = new Person("Anna4", 1600);
        Person p13 = new Person("Anna4", 1600);
        Person p14 = new Person("Anna4", 1600);
        Person p15 = new Person("Anna4", 1600);
        Person p16 = new Person("Anna4", 1600);
        Person p17 = new Person("Anna4", 1600);
        Person p18 = new Person("Anna4", 1600);
        Person p19 = new Person("Anna4", 1600);
        Person p20 = new Person("Anna4", 1600);

        Supplier<Box> supp = () -> {
            System.out.println("Returning an entry box");
            return new Box(0);
        };

        BiConsumer<Box, Person> accumulator = (result, person) -> {
            result.setValue(result.getValue() + person.getSalary());
            System.out.println(result.getValue() + " " + person);
        };

        BinaryOperator<Box> combiner = (res1, res2) -> {
            System.out.println("Combining result");
            res1.setValue(res1.getValue() + res2.getValue());
            return res1;
        };

        Function<Box,Integer> finisher = b->{
            System.out.println("finishing");
            return b.getValue();
        };
        Collector<Person, Box, Integer> collector = Collector.of(supp, accumulator, combiner, finisher);

//        Box box = Stream.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
//                p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) // 20 потоков
//        .parallel()
//                .collect(collector);

        Integer value = Stream.of(p1, p2, p3, p4)
                .collect(collector);

        System.out.println(value);
    }
}
