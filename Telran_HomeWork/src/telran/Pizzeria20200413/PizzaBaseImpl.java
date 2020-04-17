package telran.Pizzeria20200413;

public class PizzaBaseImpl implements PizzaInterface {
    private final static double PIZZA_BASE_PRISE = 3.0;

    @Override
    public void printPizza() {
        System.out.print("Стандартная пицца ");

    }

    @Override
    public double getPrice() {
        return PIZZA_BASE_PRISE;
    }
}
