package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStartTest {

    /**
     * nonStart("Hello", "There") → "ellohere"
     */
    @Test
    public void testNonStart(){
        NonStart ns = new NonStart();
        String strTest = ns.nonStart("Hello", "There");
        assertEquals("ellohere", strTest);
    }
    /**
     * nonStart("java", "code") → "avaode"
     */
    @Test
    public void testNonStart1(){
        NonStart ns = new NonStart();
        String strTest = ns.nonStart("java", "code");
        assertEquals("avaode", strTest);
    }
    /**
     * nonStart("shotl", "java") → "hotlava"
     */
    @Test
    public void testNonStart2(){
        NonStart ns = new NonStart();
        String strTest = ns.nonStart("shotl", "java");
        assertEquals("hotlava", strTest);
    }

}
