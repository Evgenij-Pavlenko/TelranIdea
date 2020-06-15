package telran;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//    Item i1 = new Item("item1", 100);
//    Item i2 = new Item("item2", 200);
//    Item i3 = new Item("item3", 300);
//    Item i4 = new Item("item4", 400);
//    List<Item> itemList1 = Arrays.asList(i1, i2);
//    List<Item> itemList2 = Arrays.asList(i3, i4);
//    Person p1 = new Person("Vasja");
//    Person p2 = new Person("Petja");
//    Order o1 = new Order(itemList1, p1);
//    Order o2 = new Order(itemList2, p2);
        Order order1 = new Order(Arrays.asList(new Item("Bag", 100)
                , new Item("ssd", 100)), new Person("Anna"));
        Order order2 = new Order(Arrays.asList(new Item("Watch", 400)), new Person("Vlad"));
        Order order3 = new Order(Arrays.asList(new Item("MacBook", 2000)), new Person("Jack"));
        Order order4 = new Order(Arrays.asList(new Item("Gold Ring", 4000)), new Person("Eva"));

        List<Order> orders = Arrays.asList(order1, order2, order3, order4);

        System.out.println(getVipPersons(orders, 1900));
        System.out.println(listHandler(orders, o -> o.getItems().size() > 1, Order::getPerson));
        System.out.println(getVipPersons2(orders, 3900));
        System.out.println(getItems(orders));
        List<Integer> list = Arrays.asList(1,2,3,5,2,2,7);

        System.out.println(listHandler(list, i-> i >3, i->i.toString()+"!"));
    }

    public static List<Person> getVipPersons(List<Order> orders, double sum) {
        return orders.stream()
                .filter(o -> o.getSumOfOrder() > sum)
                .map(Order::getPerson)
                .collect(Collectors.toList());
    }

    //обобщенный вид
    public static <T, R> List<R> listHandler(List<T> list,
                                             Predicate<T> filter,
                                             Function<T, R> map) {
        return list.stream()
                .filter(filter)
                .map(map)
                .collect(Collectors.toList());
    }


    public static Map<Person, List<Order>> getVipPersons2(List<Order> orders, double sum) {
        return orders.stream()
                .filter(o -> o.getSumOfOrder() > sum)
                .collect(Collectors.groupingBy(Order::getPerson)); //ну такое...
    }

    public static List<Item> getItems(List<Order> orders) {
        return orders.stream()
                .flatMap(o -> o.getItems().stream())
                .collect(Collectors.toList());
    }


}
