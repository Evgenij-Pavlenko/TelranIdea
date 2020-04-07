package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShiftLeftTest {

    /**
     * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
     */
    @Test
    public void testShiftLeft() {
        ShiftLeft sL = new ShiftLeft();
        int[] arrT = sL.shiftLeft(new int[]{6, 2, 5, 3});
        assertArrayEquals(new int[]{2, 5, 3, 6}, arrT);
    }

    /**
     * shiftLeft([1, 2]) → [2, 1]
     */
    @Test
    public void testShiftLeft1() {
        ShiftLeft sL = new ShiftLeft();
        int[] arrT = sL.shiftLeft(new int[]{1, 2});
        assertArrayEquals(new int[]{2, 1}, arrT);
    }

    /**
     * shiftLeft([1]) → [1]
     */
    @Test
    public void testShiftLeft2() {
        ShiftLeft sL = new ShiftLeft();
        int[] arrT = sL.shiftLeft(new int[]{1});
        assertArrayEquals(new int[]{1}, arrT);
    }

}
