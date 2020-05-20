package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountEventsTest {

    /**
     * countEvens([2, 1, 2, 3, 4]) → 3
     */
    @Test
    public void testCountEvents() {
        CountEvents c = new CountEvents();
        int sTest = c.countEvens(new int[]{2, 1, 2, 3, 4});
        assertEquals(3, sTest);
    }

    /**
     * countEvens([2, 2, 0]) → 3
     */
    @Test
    public void testCountEvents1() {
        CountEvents c = new CountEvents();
        int sTest = c.countEvens(new int[]{2, 1, 2, 3, 4});
        assertEquals(3, sTest);
    }

    /**
     * countEvens([1, 3, 5]) → 0
     */
    @Test
    public void testCountEvents2() {
        CountEvents c = new CountEvents();
        int sTest = c.countEvens(new int[]{2, 1, 2, 3, 4});
        assertEquals(3, sTest);
    }

}
