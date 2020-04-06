package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeNumbersTest {

    /**
     * intMax(1, 2, 3) → 3
     */
    @Test
    public void testThreeNumbers() {
        ThreeNumbers tN = new ThreeNumbers();
        int tTest = tN.intMax(1, 2, 3);
        assertEquals(3, tTest);
    }

    /**
     * intMax(1, 3, 2) → 3
     */
    @Test
    public void testThreeNumbers1() {
        ThreeNumbers tN = new ThreeNumbers();
        int tTest = tN.intMax(1, 3, 2);
        assertEquals(3, tTest);
    }

    /**
     * intMax(3, 2, 1) → 3
     */
    @Test
    public void testThreeNumbers2() {
        ThreeNumbers tN = new ThreeNumbers();
        int tTest = tN.intMax(3, 2, 1);
        assertEquals(3, tTest);
    }

}
