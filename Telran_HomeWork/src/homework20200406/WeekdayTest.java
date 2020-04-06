package homework20200406;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WeekdayTest {

    /**
     * sleepIn(false, false) → true
     */
    @Test
    public void testSleepIn() {
        Weekday weekday = new Weekday();
        boolean bTest = weekday.sleepIn(false, true);
        assertTrue(bTest);
    }

    /**
     * sleepIn(true, false) → false
     */
    @Test
    public void testSleepIn2() {
        Weekday weekday = new Weekday();
        boolean bTest = weekday.sleepIn(true, false);
        assertFalse(bTest);
    }

    /**
     * sleepIn(false, true) → true
     */
    @Test
    public void testSleepIn3() {
        Weekday weekday = new Weekday();
        boolean bTest = weekday.sleepIn(false, true);
        assertTrue(bTest);
    }
}
