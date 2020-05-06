package telran.Pizzeria20200413;

//В данном примере Абстрактный класс не дает сильного выигрыша в объеме кода или функциональности
public class AbstractDecorator implements PizzaInterface {
    private PizzaInterface pizzaInterface;

    public AbstractDecorator(PizzaInterface pizzaInterface) {
        this.pizzaInterface = pizzaInterface;
    }

    @Override
    public void printPizza() {
        pizzaInterface.printPizza();
    }

    @Override
    public double getPrice() {
        return pizzaInterface.getPrice();
    }
}
