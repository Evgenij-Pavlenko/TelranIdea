package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneArrayTest {

    /**
     * sum2([1, 2, 3]) → 3
     */
    @Test
    public void testOneArray() {
        OneArray arr = new OneArray();
        int sum = arr.sum2(new int[]{1, 2, 3});
        assertEquals(3, sum);
    }

    /**
     * sum2([1, 1]) → 2
     */
    @Test
    public void testOneArray1() {
        OneArray arr = new OneArray();
        int sum = arr.sum2(new int[]{1, 1});
        assertEquals(2, sum);
    }

    /**
     * sum2([1, 1, 1, 1]) → 2
     */
    @Test
    public void testOneArray2() {
        OneArray arr = new OneArray();
        int sum = arr.sum2(new int[]{1, 1, 1, 1});
        assertEquals(2, sum);
    }

    /**
     * sum2([3]) → 3
     */
    @Test
    public void testOneArray3() {
        OneArray arr = new OneArray();
        int sum = arr.sum2(new int[]{ 3});
        assertEquals(3, sum);
    }

    /**
     * sum2([]) → 0
     */
    @Test
    public void testOneArray4() {
        OneArray arr = new OneArray();
        int sum = arr.sum2(new int[]{});
        assertEquals(0, sum);
    }

}
