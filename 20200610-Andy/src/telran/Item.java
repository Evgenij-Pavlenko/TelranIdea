package telran;

public class Item {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Item(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
