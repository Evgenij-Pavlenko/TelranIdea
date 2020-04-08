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
    /**
     * transform4("aAa bcDE ekLm Iii") -> "AAA bcDE ekLm III"
     */
    @Test
    public void testWordTransformerChild(){
        String test = WorgTransformerChild.transform4("aAa bcDE ekLm Iii", true);
        assertEquals("AAA bcDE ekLm III", test);
    }
/**
     * transform4("aAa bcDE ekLm Iii") -> "aAa bcde eklm Iii"
     */
    @Test
    public void testWordTransformerChild1(){
        String test = WorgTransformerChild.transform4("aAa bcDE ekLm Iii", false);
        assertEquals("aAa bcde eklm Iii", test);
    }

}
