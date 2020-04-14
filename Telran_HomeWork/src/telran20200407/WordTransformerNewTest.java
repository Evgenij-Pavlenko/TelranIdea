package telran20200407;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static telran20200407.WordTransformerNew.transform;

public class WordTransformerNewTest {
    String test;

    /**
     * transform("aaa bcDE eklm iii") -> "AAA bcDE eklm III"
     */
    @Test
    public void testWordTransformerNew() {

        test = transform("aaa bcDE eklm iii");
        assertEquals("AAA bcDE eklm III", test);
    }

    /**
     * transform("AAA bc eklm iii") -> "AAA bc eklm III"
     */
    @Test
    public void testWordTransformerNew1() {

        test = transform("AAA bc eklm iii");
        assertEquals("AAA bc eklm III", test);
    }

    /**
     * transform4("aAa bcDE ekLm Iii") -> "AAA bcDE ekLm III"
     */
    @Test
    public void testWordTransformerNew2() {
        test = transform("aAa bcDE ekLm Iii", 3);
        assertEquals("AAA bcDE ekLm III", test);
    }

    /**
     * transform4("aAa bcDE ekLm Iii") -> "aAa bcde eklm Iii"
     */
    @Test
    public void testWordTransformerNew3() {
        test = transform("aAa bcDE ekLm Iii", 4);
        assertEquals("aAa bcde eklm Iii", test);
    }

    /**
     * transformErstLetter("aAa bcDE ekLm Iii") -> "*** bcDE ekLm III"
     */
    @Test
    public void testWordTransformerNew4() {
        test = transform("aAa bcDE ekLm Iii", "a");
        assertEquals("*** bcDE ekLm Iii", test);
    }

    /**
     * transformErstLetter("aAa bcDE ekLm Iii") -> "*** bcde eklm Iii"
     */
    @Test
    public void testWordTransformerNew5() {
        String test = transform("aAa bcDE ekLm Iii", "a");
        assertEquals("*** bcDE ekLm Iii", test);
    }
}
