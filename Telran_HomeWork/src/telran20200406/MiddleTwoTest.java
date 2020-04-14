package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleTwoTest {

    /**
     * middleTwo("string") → "ri"
     */
    @Test
    public void testMiddleTwo() {
        MiddleTwo mt = new MiddleTwo();
        String strT = mt.middleTwo("string");
        assertEquals("ri", strT);
    }

    /**
     * middleTwo("code") → "od"
     */
    @Test
    public void testMiddleTwo1() {
        MiddleTwo mt = new MiddleTwo();
        String strT = mt.middleTwo("code");
        assertEquals("od", strT);
    }

    /**
     * middleTwo("Practice") → "ct"
     */
    @Test
    public void testMiddleTwo2() {
        MiddleTwo mt = new MiddleTwo();
        String strT = mt.middleTwo("Practice");
        assertEquals("ct", strT);
    }

}
