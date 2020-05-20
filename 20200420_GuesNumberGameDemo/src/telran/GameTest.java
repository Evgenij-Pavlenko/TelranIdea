package telran;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void testGame(){
        //Mockito
        //EasyMock
        //1. specify test input
        CorrectNumberFirstReader r = new CorrectNumberFirstReader();
       CorrectNimberFirstMessenger m = new CorrectNimberFirstMessenger();
        int attempts = 2;
        int secret = 3;
        //2. run test method
        Game g = new Game(attempts,secret, m,r);
        g.play();
        //3. check the output
        assertTrue(m.isCorrect());
    }
    @Test
    public void testGame2(){
        //1. specify test input
        CorrectNumberFirstReader r = new CorrectNumberFirstReader();
        CorrectNimberFirstMessenger m = new CorrectNimberFirstMessenger();
        int attempts = 2;
        int secret = 2;
        //2. run test method
        Game g = new Game(attempts,secret, m,r);
        g.play();
        //3. check the output
        assertFalse(m.isCorrect());
    }

}
