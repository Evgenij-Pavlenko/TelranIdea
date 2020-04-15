package telran.Pizzeria20200413;

public class TomatDecorator implements PizzaInterface {
    private PizzaInterface pizzaInterface;
    private final static double TOMAT_PRISE = 1.0;

    public TomatDecorator(PizzaInterface pizzaInterface) {
        this.pizzaInterface = pizzaInterface;
    }

    public void printPizza() {
        pizzaInterface.printPizza();
        System.out.print("с помидором ");
    }

    public double getPrice() {
        return pizzaInterface.getPrice() + TOMAT_PRISE;
    }
}
