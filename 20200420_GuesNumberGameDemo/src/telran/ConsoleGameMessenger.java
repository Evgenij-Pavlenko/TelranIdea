package telran;

public class ConsoleGameMessenger implements GameMessenger {
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
