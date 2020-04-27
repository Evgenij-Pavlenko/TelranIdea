package telran.secretNumber20200416;

public class CorrectMessenger implements GameMessenger {
   private boolean isCorrect;
    @Override
    public void print(String s) {
        isCorrect = "You won, lucky!".equals(s);

    }
    public boolean isCorrect(){
        return isCorrect;
    }
}
