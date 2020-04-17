package telran.Pizzeria20200413;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzeriaTest {
    PizzaInterface p = new PizzaBaseImpl();
    @Test
    public void testPizzeria() {

        double actual = p.getPrice();
        double expected = 3.0;
        assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testPizzeria1() {
        PizzaInterface pt = new TomatoDecorator(p);
        double actual = pt.getPrice();
        double expekted = 4.0;
        assertEquals(expekted, actual, 0.0);
    }
    @Test
    public void testPizzeria2() {
        PizzaInterface pp = new PillsDecorator(p);
        double actual = pp.getPrice();
        double expekted = 4.5;
        assertEquals(expekted, actual, 0.0);
    }
     @Test
    public void testPizzeria3() {
        PizzaInterface ptp = new TomatoDecorator(new PillsDecorator(p));
        double actual = ptp.getPrice();
        double expekted = 5.5;
        assertEquals(expekted, actual, 0.0);
    }

}
