package telran.secretNumber20200416;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GuestNumberGameTest {
    //test input

//    почему так не работает? должно ж подхватить метод из GameMessenger() и CorrectNumberReader()

//    GameMessenger gm = new CorrectMessenger();
//    NumberReader nr = new CorrectNumberReader();

    CorrectMessenger gm = new CorrectMessenger();
    NumberReader nr = new CorrectNumberReader();

    //run test
    @Test
    public void testGuessNumberGame1() {
        int attempt = 3;
        int numberPC = 5; // Wright number is 5
        GuessNumberGame gn = new GuessNumberGame(attempt, numberPC, gm, nr);
        gn.play();
        //check output
        assertTrue(gm.isCorrect());
    }

    @Test
    public void testGuessNumberGame2() {
        int attempt = 3;
        int numberPC = 3; // Wright number is 5
        GuessNumberGame gn = new GuessNumberGame(attempt, numberPC, gm, nr);
        gn.play();
        //check output
        assertFalse(gm.isCorrect());
    }
}
