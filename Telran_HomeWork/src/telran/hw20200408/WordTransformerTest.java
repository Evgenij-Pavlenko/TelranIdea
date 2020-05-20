package telran.hw20200408;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static telran.hw20200408.WordTransformer.transform;

public class WordTransformerTest {

    @Test
    public void testWordTransformerUpperCase3() {

        String input = "aaa bcDE ekLm iii";
        String actual = transform(input);
        String expected = "AAA bcDE ekLm III";
        assertEquals(expected, actual);
    }

    @Test
    public void testWordTransformerUpperCase3_1() {

        String input = "aaa bcDE ekLm iii";
        String actual = transform(input, new WordTransformerUpperCase3());
        String expected = "AAA bcDE ekLm III";
        assertEquals(expected, actual);
    }

    @Test
    public void testWordTransformerLowerCase4() {
        String input = "aaa bcDE ekLm iii";
        String actual = transform(input, new WordTransformerLowerCase4());
        String expected = "aaa bcde eklm iii";
        assertEquals(expected, actual);
    }

    @Test
    public void testWordTransformerFirstAToAllStars() {
        String input = "aaa bcDE ekLm iii";
        String actual = transform(input, new WordTransformerFirstAToAllStars());
        String expected = "*** bcDE ekLm iii";
        assertEquals(expected, actual);
    }


}
