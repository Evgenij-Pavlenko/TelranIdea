package telran.Pizzeria20200413;

public class PillsDecorator extends AbstractDecorator {
    private final static double PILS_PRICE = 1.5;

    public PillsDecorator(PizzaInterface pizzaInterface) {
        super(pizzaInterface);
    }

    public void printPizza() {
        super.printPizza();
        System.out.print("с грибами ");
    }

    public double getPrice() {
        return super.getPrice() + PILS_PRICE;
    }

}
