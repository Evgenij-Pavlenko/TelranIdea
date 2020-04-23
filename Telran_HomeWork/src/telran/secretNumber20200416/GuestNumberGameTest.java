package telran.secretNumber20200416;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GuestNumberGameTest {
    //test input

//    GameMessenger gm = new CorrectMessenger();
//    NumberReader nr = new CorrectNumberReader();
    // починил ) добавил в interface GameMessenger - default method isCorrect()
//    это бред был - мы же просто тестируем - не нужно лезть в интерфейс самого приложения

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
