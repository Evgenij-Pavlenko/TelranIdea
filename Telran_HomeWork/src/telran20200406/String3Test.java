package telran20200406;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String3Test {

    /**
     * endUp("Hello") → "HeLLO"
     */
    @Test
    public void testString3(){
        String3 string3 = new String3();
        String sTest = string3.endUp("Hello");
        assertEquals("HeLLO", sTest);
    }
    /**
     * endUp("hi there") → "hi thERE"
     */
    @Test
    public void testString31(){
        String3 string3 = new String3();
        String sTest = string3.endUp("hi there");
        assertEquals("hi thERE", sTest);
    }
    /**
     * endUp("hi") → "HI"
     */
    @Test
    public void testString32(){
        String3 string3 = new String3();
        String sTest = string3.endUp("hi");
        assertEquals("HI", sTest);
    }

}
