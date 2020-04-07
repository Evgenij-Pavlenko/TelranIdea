package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoArraysTest {
    /**
     * commonEnd([1, 2, 3], [7, 3]) → true
     */
    @Test
    public void testTwoArrays() {
        TwoArrays t = new TwoArrays();
        boolean b = t.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3});
        assertTrue(b);
    }

    /**
     * commonEnd([1, 2, 3], [7, 3, 2]) → false
     */
    @Test
    public void testTwoArrays1() {
        TwoArrays t = new TwoArrays();
        boolean b = t.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2});
        assertFalse(b);
    }

    /**
     * commonEnd([1, 2, 3], [1, 3]) → true
     */
    @Test
    public void testTwoArrays2() {
        TwoArrays t = new TwoArrays();
        boolean b = t.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3});
        assertTrue(b);
    }

}
