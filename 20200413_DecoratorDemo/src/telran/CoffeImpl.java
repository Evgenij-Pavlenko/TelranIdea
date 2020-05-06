package telran;

public class CoffeImpl implements Coffe {

    private final static int BASIC_COFFE_PRICE = 50;
    @Override
    public int getPrice() {
        return BASIC_COFFE_PRICE;
    }
}
