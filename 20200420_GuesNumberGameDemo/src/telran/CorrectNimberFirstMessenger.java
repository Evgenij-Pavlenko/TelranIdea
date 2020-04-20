package telran;

public class CorrectNimberFirstMessenger implements GameMessenger {
   private boolean isCorrect = false;
    @Override
    public void print(String s) {
        System.out.println(s);
        isCorrect = "Congrats! You won!".equals(s);
//        isCorrect = s.equals("Congrats! You won!"); // или так - для простоты понимания
    }
    public  boolean isCorrect(){
        return isCorrect;
    }
}
