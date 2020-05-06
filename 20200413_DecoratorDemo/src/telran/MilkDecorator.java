package telran;

public class MilkDecorator extends AbstractDecorator {
    private final static int MILK_PRICE = 10;

    public MilkDecorator(Coffe coffe) {
        super(coffe);
    }

    public int getPrice(){
        return super.getPrice() + MILK_PRICE;
    }
}
