package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ZeroMaxTest {

    /**
     * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
     */
    @Test
    public void testZeroMax(){
        ZeroMax zM = new ZeroMax();
        int[] test= zM.zeroMax(new int[]{0,5,0,3});
        assertArrayEquals(new int[]{5,5,3,3}, test);
    }
    /**
     * zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
     */
    @Test
    public void testZeroMax1(){
        ZeroMax zM = new ZeroMax();
        int[] test= zM.zeroMax(new int[]{0,4,0,3});
        assertArrayEquals(new int[]{3,4,3,3}, test);
    }
    /**
     * zeroMax([0, 1, 0]) → [1, 1, 0]
     */
    @Test
    public void testZeroMax2(){
        ZeroMax zM = new ZeroMax();
        int[] test= zM.zeroMax(new int[]{0,1,0});
        assertArrayEquals(new int[]{1,1,0}, test);
    }

}
