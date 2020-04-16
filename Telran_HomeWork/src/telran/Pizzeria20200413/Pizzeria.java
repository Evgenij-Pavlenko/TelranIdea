package telran.Pizzeria20200413;

public class Pizzeria {
    public static void main(String[] args) {
        PizzaInterface pizza = new PizzaBaseImpl();

        PizzaInterface pt = new TomatoDecorator(pizza);

        PizzaInterface pp = new PillsDecorator(pizza);

        PizzaInterface ptp = new TomatoDecorator(new PillsDecorator(pizza));

        PizzaInterface[] pizzas = new PizzaInterface[]{pizza, pt, pp, ptp};

        pizzaList(pizzas);

    }

    private static void pizzaList(PizzaInterface[] pizzas) {
        for (PizzaInterface p : pizzas) {
            p.printPizza();
            System.out.println("Preice is: " + p.getPrice() + " EUR(€)");
        }
    }
}
