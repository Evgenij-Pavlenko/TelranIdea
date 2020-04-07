package telran20200407;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordTransformerTest {

    /**
     * transform("aaa bcDE eklm iii") -> "AAA bcDE eklm III"
     */
    @Test
    public void testWordTransformer(){

        String test = WordTransformer.transform("aaa bcDE eklm iii");
        assertEquals("AAA bcDE eklm III", test);
    }
    /**
     * transform("AAA bc eklm iii") -> "AAA bc eklm III"
     */
    @Test
    public void testWordTransformer2(){

        String test = WordTransformer.transform("AAA bc eklm iii");
        assertEquals("AAA bc eklm III", test);
    }

}
