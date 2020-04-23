package telran.secretNumber20200416;

public interface GameMessenger {
    void print(String s);
    default boolean isCorrect(){
        return false;
    }
}
