package telran.secretNumber20200416;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GuestNumberGameTest {
    GuessNumberGame gng = new GuessNumberGame();

    @Test
    public void testGuestNumberGame1(){
        int a = 10;
        int b = 5;
        assertTrue(gng.compareTwoInts(a,b));
    }

    @Test
    public void testGuestNumberGame2(){
        int a = 5;
        int b = 10;
        assertFalse(gng.compareTwoInts(a,b));
    }

}
