package telran;

public class SugarDecorator extends AbstractDecorator {
    private final static int SUGAR_PRICE = 5;

    public SugarDecorator(Coffe coffe) {
        super(coffe);
    }

    public int getPrice() {
        return super.getPrice() + SUGAR_PRICE;
    }
}
