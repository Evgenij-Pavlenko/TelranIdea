package homework20200406;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsDifferenceTest {
    /**
     * diff21(19) → 2
     */
    @Test
    public void testAbsDifference(){
        AbsDifference abs = new AbsDifference();
        int iTest = abs.diff21(19);
        assertEquals(2,iTest);
    }
    /**
     * diff21(10) → 11
     */
    @Test
    public void testAbsDifference1(){
        AbsDifference abs = new AbsDifference();
        int iTest = abs.diff21(10);
        assertEquals(11,iTest);
    }
    /**
     * diff21(21) → 0
     */
    @Test
    public void testAbsDifference2(){
        AbsDifference abs = new AbsDifference();
        int iTest = abs.diff21(19);
        assertEquals(2,iTest);
    }
    /**
     * diff21(25) → 8
     */
    @Test
    public void testAbsDifference3(){
        AbsDifference abs = new AbsDifference();
        int iTest = abs.diff21(19);
        assertEquals(2,iTest);
    }
    /**
     * diff21(-1) → 22
     */
    @Test
    public void testAbsDifference4(){
        AbsDifference abs = new AbsDifference();
        int iTest = abs.diff21(-1);
        assertEquals(22,iTest);
    }

}
