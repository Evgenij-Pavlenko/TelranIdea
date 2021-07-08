package telran;

import java.util.List;

public class Order {
    List<Item> items;
    Person person;

    public Order(List<Item> itemList, Person person) {
        this.items = itemList;
        this.person = person;
    }

    public List<Item> getItems() {
        return items;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Order{" +
                "itemList=" + items +
                ", person=" + person +
                '}';
    }
    public double getSumOfOrder(){
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}
